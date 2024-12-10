import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    //get username
    System.out.print("Welcome! Please type a username: ");
    String username = userInput.nextLine();
    System.out.println("Welcome, " + username + "!");

    //Create player and opponent
    Adventurer player = new Mage(username, 30);
    System.out.println("\nYour character: " + printStats(player));
    Adventurer enemy = new CodeWarrior();
    System.out.println("Your opponent: " + printStats(enemy));

    System.out.println("FIGHT!\n");
	
	//gameplay loop
    while (player.getHP() > 0 && enemy.getHP() > 0) {
	  playerMove(player, enemy, userInput);
	  System.out.println("\n");
	  if (enemy.getHP() > 0) {
	    enemyMove(enemy, player);
	  }
	  System.out.println("\n");
	}
	if (player.getHP() > 0) {
	  System.out.println("\n" + player + " has won the battle!");
	}
	else {
	  System.out.println("\n" + player + " has lost the battle!");
	}
  }



  public static void playerMove(Adventurer player, Adventurer enemy, Scanner userInput) {
	  
	System.out.print("Your move! Type: (a)ttack / (sp)ecial / (su)pport / quit : ");
	String action = userInput.nextLine().toLowerCase();
	boolean invalid = true; //tracks to see if the user input was valid since and else would only pair with one if
	
	if (action.equals("quit")) {
	  System.exit(0);
	}
	
	if (action.equals("a") || action.equals("attack")) {
	  System.out.println(player.attack(enemy));
	  invalid = false;
	}
	if (action.equals("su") || action.equals("support")) {
	  System.out.println(player.support());
	  invalid = false;
	}
	if (action.equals("sp") || action.equals("special")) {
	  System.out.println(player.specialAttack(enemy));
	  invalid = false;
	}
	
	if (invalid) {
	  System.out.println("Invalid input! Please choose one of the below options to take your turn.");
	  playerMove(player, enemy, userInput);
	}
	
  }

  public static void enemyMove(Adventurer enemy, Adventurer player) {
    int option = (int) (Math.random() * 3);
    if (option == 0) {
      System.out.println(enemy.attack(player));
    }
    if (option == 1) {
      System.out.println(enemy.support());
    }
    if (option == 2) {
      System.out.println(enemy.specialAttack(player));
    }
  }
  
  
  
  public static String printStats(Adventurer a) {
    return a + ", " + a.getHP() + "/" + a.getmaxHP() + " HP, " + a.getSpecial() + "/" + a.getSpecialMax() + " " + a.getSpecialName();
  }
  
}

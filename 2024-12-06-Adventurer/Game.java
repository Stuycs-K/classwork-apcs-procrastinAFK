import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    //get username
    System.out.println("Welcome! Please type a username.");
    String username = userInput.nextLine();
    System.out.println("Welcome, " + username + "!");

    //Create p1 and opponent
    Adventurer p1 = new Mage(username);
    System.out.println("\nYour character: " + printStats(p1));
    Adventurer enemy = new CodeWarrior();
    System.out.println("Your opponent: " + printStats(enemy));

    System.out.println("FIGHT!");

    
  }

  public static String printStats(Adventurer p) {
    return p + ", " + p.getHP() + "/" + p.getmaxHP() + " HP, " + p.getSpecial() + "/" + p.getSpecialMax() + " " + p.getSpecialName();
  }

  public static void enemyMove(Adventurer enemy, Adventurer other) {
    int option = (int) Math.random() * 3;
    if (option == 0) {
      enemy.attack(other);
    }
    if (option == 1) {
      enemy.support();
    }
    else {
      enemy.specialAttack(other);
    }
  }
}

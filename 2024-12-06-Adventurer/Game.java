import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    //get username
    System.out.println("Welcome! Please type a username.");
    String username = userInput.nextLine();
    System.out.println("Welcome, " + username + "!");
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

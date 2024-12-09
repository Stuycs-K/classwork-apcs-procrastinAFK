public class Driver {
  public static void main(String[] args) {
	  
	System.out.println("\nTESTING BASIC MAGE:");
    Adventurer p1 = new Mage("Aiura");
	System.out.println("toString: " + p1);
	System.out.println("Name (param = \"Aiura\"): " + p1.getName());
	System.out.println("Max HP (no param): " + p1.getmaxHP());
	System.out.println("Max special (no param): " + p1.getSpecialMax());
	
	System.out.println("\nTESTING MAGE WITH HP PARAM:");
	p1 = new Mage("Helena", 30);
	System.out.println("toString: " + p1);
	System.out.println("Name (param = \"Helena\"): " + p1.getName());
	System.out.println("Max HP (param = 30): " + p1.getmaxHP());
	System.out.println("Max special (no param): " + p1.getSpecialMax());
	
	System.out.println("\nTESTING MAGE WITH HP AND SPECIALMAX PARAMS:");
	p1 = new Mage("Morgan", 20, 15);
	System.out.println("toString: " + p1);
	System.out.println("Name (param = \"Morgan\"): " + p1.getName());
	System.out.println("Max HP (param = 20): " + p1.getmaxHP());
	System.out.println("Max special (param = 15): " + p1.getSpecialMax());
	
	System.out.println("\nTESTING METHODS: ");
	Adventurer p2 = new Mage("Sancha");
	System.out.println("p1: " + p1 + "; p2: " + p2);
	System.out.println("These mages both should have the same special ability!");
	System.out.println("  - " + p1 + ": " + p1.getSpecialName());
	System.out.println("  - " + p2 + ": " + p2.getSpecialName());
	
	System.out.println("\nFIGHT!");
	System.out.println(p1.attack(p2));
	System.out.println(p2.support());
	System.out.println(p1.support());
	System.out.println(p2.specialAttack(p1));
	System.out.println(p1.support());
	System.out.println(p2.specialAttack(p1));
	System.out.println(p1.specialAttack(p2));
	System.out.println(p2.specialAttack(p1));
	System.out.println("Divine intervention! " + p2 + "'s " + p2.getSpecialName() + " has been restored by " + p2.restoreSpecial(40) + " points!");
	System.out.println(p1.support(p2));
	System.out.println(p2.specialAttack(p1));
	p2.setHP(1);
	System.out.println("Divine intervention again! " + p2 + "'s HP has been set to " + p2.getHP() + "!");
	System.out.println(p1.attack(p2));
	
	System.out.println("\nBACK TO METHODS:");
	System.out.print(p1 + " sustained lifelong injuries from the battle. Their maxHealth used to be " + p1.getmaxHP());
	p1.setmaxHP(8);
	System.out.println(", but now it's " + p1.getmaxHP() + ".");
	System.out.print(p1 + " also changed their name. ");
	p1.setName("Sahara");
	System.out.println("Their new name is " + p1.getName() + ".");
  }
}

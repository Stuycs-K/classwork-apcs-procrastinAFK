public class Driver {
  public static void main(String[] args) {
	  
	System.out.println("\nTESTING BASIC MAGE:");
    Mage p1 = new Mage("Aiura");
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
	Mage p2 = new Mage("Sancha");
	System.out.println("p1: " + p1 + "; p2: " + p2);
	System.out.println("These mages both should have the same special ability!");
	System.out.println("  - " + p1 + ": " + p1.getSpecialName());
	System.out.println("  - " + p2 + ": " + p2.getSpecialName());
	
  }
}

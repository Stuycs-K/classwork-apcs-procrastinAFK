/* When we overrode getName to print "The Mighty NAME" instead of
   just "NAME" for birds, calling speak() on a bird object caused the System
   to print the "The Mighty NAME" instead of "NAME".*/
/* Trying to convert an Animal into a Bird didn't work
   because the created Animal did not have all the traits
   (fields) that a Bird would require. */

public class Driver {
	
  public static void main(String[] args) {
	  
	System.out.println("\nDog (animal):");
    Animal doggo = new Animal("bark", 2, "Charlie");
    doggo.speak();

    System.out.println("\nBird (bird):");
    Bird birdie = new Bird("chirp", 3, "Coco", 4, "purple");
    birdie.speak();
	
	System.out.println("\nAnimal (animal):");
	Animal a1 = new Animal("squeak", 2, "FurFur");
	a1.speak();
	
	System.out.println("\nBird (bird):");
    Bird b1 = new Bird("chirp", 3, "FeatherFeather", 4, "red");
	b1.speak();
	
	/* System.out.println("\nBird (animal):");
	   Bird b2 = new Animal("squeak", 2, "FeatherFur");
	   b2.speak(); */
	
	System.out.println("\nAnimal (bird):");
	Animal a2 = new Bird("chirp", 3, "FurFeather", 4, "red"); 
	a2.speak();
	
  }
  
}


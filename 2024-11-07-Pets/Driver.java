/* When we overrode getName to print "The Mighty NAME" instead of
   just "NAME" for birds, calling speak() on a bird object caused the System
   to print the "The Mighty NAME" instead of "NAME".*/
public class Driver {
  public static void main(String[] args) {
    Animal doggo = new Animal("bark", 2, "Charlie");
    doggo.speak();

    Bird birdie = new Bird("chirp", 3, "Coco", 4, "purple");
    birdie.speak();
  }
}


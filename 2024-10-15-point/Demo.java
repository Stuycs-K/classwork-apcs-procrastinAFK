public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return 0.0;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);

    System.out.println ("Point 1: " + p1); // Expected: (1.0, 1.0)
    System.out.println ("Point 2: " + p2); // Expected: (-1.0, -1.0)
    System.out.println ("Point 3: " + p3); // Expected: (3.0, 4.0)


    Point cp1 = new Point(p1);
    Point cp2 = new Point(p2);
    Point cp3 = new Point(p3);

    System.out.println ("Copy point 1: " + cp1); // Expected: (1.0, 1.0)
    System.out.println ("Copy point 2: " + cp2); // Expected: (-1.0, -1.0)
    System.out.println ("Copy point 3: " + cp3); // Expected: (3.0, 4.0)

    /*
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    */
  }
}

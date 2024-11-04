public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return a.distanceTo(b);
  }

  public static void main(String[]args){
	//Testing Point (new point)
	System.out.println('\n' + "TESTING POINT (NEW POINT):");
	
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);

    System.out.println ("Point 1: " + p1); // Expected: (1.0, 1.0)
    System.out.println ("Point 2: " + p2); // Expected: (-1.0, -1.0)
    System.out.println ("Point 3: " + p3); // Expected: (3.0, 4.0)


    //Testing Point (copy of point)
	System.out.println('\n' + "TESTING POINT (COPY OF POINT):");
	
    Point cp1 = new Point(p1);
    Point cp2 = new Point(p2);
    Point cp3 = new Point(p3);

    System.out.println ("Copy point 1: " + cp1); // Expected: (1.0, 1.0)
    System.out.println ("Copy point 2: " + cp2); // Expected: (-1.0, -1.0)
    System.out.println ("Copy point 3: " + cp3); // Expected: (3.0, 4.0)

    
	//Testing distance from p1 to p2
	System.out.println('\n' + "TESTING DISTANCE OF P1 TO P2:");
    System.out.println("Distance from p1 to p2 using distance: " + distance(p1,p2));
    System.out.println("Distance from p1 to p2 using Point.distance: " + Point.distance(p1,p2));
    System.out.println("Distance from p1 to p2 using distanceTo: " + p1.distanceTo(p2));
	
	//Testing distance from p2 to p1
	System.out.println('\n' + "TESTING DISTANCE OF P2 TO P1:");
	System.out.println("Distance from p2 to p1 using distance: " + distance(p2,p1));
    System.out.println("Distance from p2 to p1 using Point.distance: " + Point.distance(p2,p1));
    System.out.println("Distance from p2 to p1 using distanceTo: " + p2.distanceTo(p1));
	
	//Testing distance from p1 to cp1
	System.out.println('\n' + "TESTING DISTANCE OF P1 TO CP1:");
	System.out.println("Distance from p1 to cp1 using distance: " + distance(p1,cp1));
    System.out.println("Distance from p1 to cp1 using Point.distance: " + Point.distance(p1,cp1));
    System.out.println("Distance from p1 to cp1 using distanceTo: " + p1.distanceTo(cp1));
    
	//Testing distance from p1 to p1
	System.out.println('\n' + "TESTING DISTANCE OF P1 TO P1:");
	System.out.println("Distance from p1 to p1 using distance: " + distance(p1,p1));
    System.out.println("Distance from p1 to p1 using Point.distance: " + Point.distance(p1,p1));
    System.out.println("Distance from p1 to p1 using distanceTo: " + p1.distanceTo(p1));
	
	
	//Making an equilateral triangle with side length 1
	System.out.println('\n' + "TRYING TO MAKE AN EQUILATERAL TRIANGLE WITH SIDE LENGTH 1:");
	Point v1 = new Point(0,0);
	Point v2 = new Point(1,0);
	Point v3 = new Point(0.5, Math.sqrt(3.0)/2.0);
	
	System.out.println("v1: " + v1);
    System.out.println("v2: " + v2);
    System.out.println("v3: " + v3);
	
	System.out.println("Length of side 1: " + distance(v1,v2));
    System.out.println("Length of side 2: " + distance(v2,v3));
	System.out.println("Length of side 3: " + distance(v1,v3));
	
  }
}

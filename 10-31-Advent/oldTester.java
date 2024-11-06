 public class oldTester { //for my old tests in TriangleTester.java
 
  public static void main(String[] args) {

	System.out.println('\n' + "TESTING ISTRIANGLE:");
    int[] teststuff = new int[]{5, 10, 25};
    System.out.println(teststuff + " (should be FALSE): " + TriangleTester.isTriangle(teststuff));
    teststuff = new int[]{5, 100, 5};
    System.out.println(teststuff + " (should be FALSE): " + TriangleTester.isTriangle(teststuff));
    teststuff = new int[]{5, 5, 2};
    System.out.println(teststuff + " (should be TRUE): " + TriangleTester.isTriangle(teststuff));
    teststuff = new int[]{1, 2, 3};
    System.out.println(teststuff + " (should be FALSE): " + TriangleTester.isTriangle(teststuff));
    teststuff = new int[]{3, 2, 3};
    System.out.println(teststuff + " (should be TRUE): " + TriangleTester.isTriangle(teststuff));

	System.out.println('\n' + "TESTING COUNTTRIANGLESA:");
	System.out.println("Using a file that doesn't exist (should print 0 and that the file doesn't exist): " + TriangleTester.countTrianglesA("noExist.txt"));
	System.out.println("Testing inputTri.txt with TEMPORARY numbers (USED TO print 2): " + TriangleTester.countTrianglesA("inputTri.txt"));
	
	System.out.println('\n' + "TESTING COUNTTRIANGLESB:");
	System.out.println("Using a file that doesn't exist (should print 0 and that the file doesn't exist): " + TriangleTester.countTrianglesB("noExist.txt"));
	System.out.println("Testing inputTri.txt with TEMPORARY numbers (USED TO print 8): " + TriangleTester.countTrianglesB("inputTri.txt"));
	
  }
}
//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) { //new triangle per \n, sides split by spaces
    int count = 0;
	try {
      File file = new File(filename);
	  Scanner input = new Scanner(file);
	  while (input.hasNextLine()) {
	    String line = input.nextLine();
	    String[] nums = line.split(" ");
	    int[] sides = new int[3]; //sides of a triangle
	    for (int i = 0; i < sides.length; i++) {
		  sides[i] = Integer.parseInt(nums[i]);
	    }
	    if (isTriangle(sides)) {
		  count++;
	    }
	  }
	  input.close();
	} catch(FileNotFoundException ex) {
	  System.out.println("File not found!");
	}
    return count;
  }
  
  public static int countTrianglesB(String filename) { //new triangle per space, sides split by \n
	int count = 0;
	try {
      File file = new File(filename);
	  Scanner input = new Scanner(file);
	  while (input.hasNextLine()) { //actually means it has 3 or more lines since we're allowed to assume there is a multiple of 3 number of lines
	    int[][] allSides = new int[3][3]; //3 triangles, 3 sides per triangle
		for (int sideNum = 0; sideNum < allSides.length; sideNum++) { //make a 2D array with all the side lengths of each triangle
		  String[] nums = input.nextLine().split(" ");
		  int[] sides = new int[3]; //side number sideNum of each triangle
	      for (int i = 0; i < sides.length; i++) {
		    sides[i] = Integer.parseInt(nums[i]);
	      }
		  allSides[sideNum] = sides;
		}
		for (int i = 0; i < 3; i++) { //for each triangle
		  int[] triSides = new int[]{allSides[0][i], allSides[1][i], allSides[2][i]};
	      if (isTriangle(triSides)) {
		    count++;
	      }
		}
	  }
	  input.close();
	} catch(FileNotFoundException ex) {
	  System.out.println("File not found!");
	}
    return count;
  }

  public static boolean isTriangle(int[] sides) {
    boolean isTri = true;
    for (int i = 0; i < sides.length && isTri; i++) {
      if (sides[0] + sides[1] <= sides[2]) {
        isTri = false;
      }
      sides = new int[]{sides[1], sides[2], sides[0]};
    }
    return isTri;
  }

  public static void main(String[] args) {
	
	System.out.println('\n' + "TESTING ISTRIANGLE:");
    int[] teststuff = new int[]{5, 10, 25};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 100, 5};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 5, 2};
    System.out.println(teststuff + " (should be TRUE): " + isTriangle(teststuff));
    teststuff = new int[]{1, 2, 3};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{3, 2, 3};
    System.out.println(teststuff + " (should be TRUE): " + isTriangle(teststuff));
	
	System.out.println('\n' + "TESTING COUNTTRIANGLESA:");
	System.out.println("Using a file that doesn't exist (should print 0 and that the file doesn't exist): " + countTrianglesA("noExist.txt"));
	System.out.println("Testing inputTri.txt with TEMPORARY numbers (should print 2): " + countTrianglesA("inputTri.txt"));
  }
}

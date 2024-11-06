//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) {
    int count = 0;
	try {
      File file = new File(filename);
	  Scanner input = new Scanner(file);
	  while (input.hasNextLine()) {
	    String line = input.nextLine();
	    String[] nums = line.split(" ");
	    int[] sides = new int[nums.length];
	    for (int i = 0; i < nums.length; i++) {
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

//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) {
    //do file parsing
    return 0; //so it can compile
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
  }
}

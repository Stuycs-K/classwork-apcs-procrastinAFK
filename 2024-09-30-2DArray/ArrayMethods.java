//1. Write both your names + emails at the top of the document as a comment.
// Eva Carvallo evac81@nycstudents.net
// Maya Berchin mayab97@nycstudents.net

public class ArrayMethods {

  public static void main(String[] args) {
    String arrow = "  ^--> "; //formatting
    //test aryToString() (1D arrays)
    System.out.println('\n' + "TESTING ARYTOSTRING() -- 1D ARRAYS");
    System.out.println("*Note* This should already be working, just testing to double check");
    int[] test1 = {1, 2, 3, 4};
    System.out.println(arrow + "ID: " + test1 + "; CONTENTS: " + aryToString(test1));
    System.out.println("*Note* This function will cause an error if the parameter is a non-initialized array (contains null)");
    //test arrToString() (2D arrays)
    System.out.println('\n' + "TESTING ARRTOSTRING() -- 2D ARRAYS");
    int[][] test2a = new int[3][4];
    System.out.println(arrow + "Default rectangular array contents: " + arrToString(test2a));
    int[][] test2b = {{0, 1, 2}, {10, 20, 30}, {}, {123, 1234, 12345, 123456, 1234567, 12345678, 123456789}};
    System.out.println(arrow + "Custom non-rectangular array contents: " + arrToString(test2b));
	int[][] test2c = new int[2][0];
	System.out.println(arrow + "Array with two rows and size zero columns: " + arrToString(test2c));
    System.out.println("*Note* This function calls the one above (aryToString()), so null will once again cause an error.");
	//test arr2DSum()
	System.out.println('\n' + "TESTING ARR2DSUM():");
	int[][] test3a = {{0, 1, 2}, {10}, {}, {20, 7, -40}};
	System.out.println(arrow + "Array of different lengths; includes an empty array and a negative number");
	System.out.println("  |    " + arrow + "Array contents: " + arrToString(test3a));
	System.out.println("  |    " + arrow + "Should sum to: 0");
	System.out.println("  |    " + arrow + "Sum from function: " + arr2DSum(test3a));
	test3a = new int[2][3];
	System.out.println(arrow + "Default 2x3 array; should sum to 0; sums to: " + arr2DSum(test3a));
	int[][] test3b = {{}};
	System.out.println(arrow + "2D array of length one; its only item is empty; should return 0; returns: " + arr2DSum(test3b));
	int[][] test3d = {{1, 2, 3}, {2, 2}};
	System.out.println(arrow + "Array contents: " + arrToString(test3d) + "; sums to: " + arr2DSum(test3d));
	int[][] test3e = {{-1, -2, -3}, {-4}};
	System.out.println(arrow + "Array contents: " + arrToString(test3e) + "; sums to: " + arr2DSum(test3e));
	//test swapRC()
	System.out.println('\n' + "TESTING SWAPRC():");
	int[][] test4a = new int[3][4];
	System.out.println(arrow + "Change a 3x4 default array into a 4x3 default array:");
	System.out.println("  |    " + arrow + "Original array: " + arrToString(test4a));
	test4a = swapRC(test4a);
	System.out.println("  |    " + arrow + "Swapped array: " + arrToString(test4a));
	test4a = swapRC(test4a);
	System.out.println("  |    " + arrow + "Swapped back: " + arrToString(test4a));
	int[][] test4b = {{0, 1, 2}, {0, 1, 2}};
	System.out.println(arrow + "Change a 2x3 custom array into a 3x2 custom array:");
	System.out.println("  |    " + arrow + "Original array: " + arrToString(test4b));
	test4b = swapRC(test4b);
	System.out.println("  |    " + arrow + "Swapped array: " + arrToString(test4b));
	test4b = swapRC(test4b);
	System.out.println("  |    " + arrow + "Swapped back: " + arrToString(test4b));
	int[][] test4c = {{0, 1, 2, 3, 4, 5}};
	System.out.println(arrow + "Change a 1x5 custom array into a 5x1 custom array:");
	System.out.println("  |    " + arrow + "Original array: " + arrToString(test4c));
	test4c = swapRC(test4c);
	System.out.println("  |    " + arrow + "Swapped array: " + arrToString(test4c));
	test4c = swapRC(test4c);
	System.out.println("  |    " + arrow + "Swapped back: " + arrToString(test4c));
  }

//2. Copy your aryToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
  public static String aryToString(int[] nums) {
    String fin = "[";
    for (int i = 0; i < nums.length; i++) {
      fin += nums[i] + "";
      if (i < nums.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]ary) {
  //this should use arrToString(int[])
    String fin = "[";
    for (int i = 0; i < ary.length; i++) {
      fin += aryToString(ary[i]);
      if (i < ary.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

/*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums) {
    //use a nested loop to solve this
    int sum = 0;
	for (int i = 0; i < nums.length; i++) { //loops through the first dimension of the 2D array
	  for (int j = 0; j < nums[i].length; j++) { //loops through the second dimension of the 2D array
	    sum += nums[i][j];
	  }
	}
	return sum;
  }

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums) {
	int[][] swap = new int[nums[0].length][nums.length];
	for (int i = 0; i < swap.length; i++) {
		for (int j = 0; j < swap[i].length; j++) {
			swap[i][j] = nums[j][i];
		}
	}
	return swap;
  }

}

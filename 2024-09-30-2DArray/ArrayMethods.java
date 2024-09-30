//1. Write both your names + emails at the top of the document as a comment.
// Eva Carvallo evac81@nycstudents.net
// Maya Berchin mayab97@nycstudents.net

public class ArrayMethods {

  public static void main(String[] args) {
    String arrow = "   ^--> "; //formatting
    //test aryToString() (1D arrays)
    System.out.println('\n' + "TESTING ARYTOSTRING() -- 1D ARRAYS");
    System.out.println("*Note* This should already be working, just testing to double check");
    int[] test1 = {1, 2, 3, 4};
    System.out.println(arrow + "ID: " + test1 + "; CONTENTS: " + aryToString(test1));
    System.out.println("*Note* This function will cause an error if the parameter is a non-initialized array (null)");
    //test arrToString() (2D arrays)
    System.out.println('\n' + "TESTING ARRTOSTRING() -- 2D ARRAYS");
    int[][] test2a = new int[3][4];
    System.out.println(arrow + "Default rectangular array contents: " + arrToString(test2a));
    int[][] test2b = {{0, 1, 2}, {10, 20, 30}, {}, {123, 1234, 12345, 123456, 1234567, 12345678, 123456789}};
    System.out.println(arrow + "Custom non-rectangular array contents: " + arrToString(test2b));
    System.out.println("*Note* This function calls the one above (aryToString()), so null will once again return an error.");
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
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    return 0; //temporary
  }

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

}

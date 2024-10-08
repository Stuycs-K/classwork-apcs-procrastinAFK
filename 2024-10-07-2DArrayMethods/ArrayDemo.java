import java.util.Arrays;

public class ArrayDemo{
	
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
	
	//formatting
	String arrow = "  ^--> ";
	
	//variables to compare two answers
	String ans; //intended or correct answer
	String myAns;

    //Testing 1D arrToString() using Arrays.toString()
    System.out.println('\n' + "TESTING 1D ARRTOSTRING() USING ARRAYS.TOSTRING():");
	int[] test = {0, 1, 2, 3};
	ans = Arrays.toString(test);
	myAns = arrToString(test);
    System.out.println("Array contents according to Arrays.toString(): " + ans);
	System.out.println("Array contents according to my 1D arrToString(): " + myAns);
	System.out.println("Same contents: " + ans.equals(myAns));

    //Testing 2D arrToString() using Arrays.deepToString()
    System.out.println('\n' + "TESTING 2D ARRTOSTRING() USING ARRAYS.DEEPTOSTRING():");
	int[][] test2 = {{-99}, {0}, {0, 1}, {-2, 3, -4}};
	ans = Arrays.deepToString(test2);
	myAns = arrToString(test2);
    System.out.println("Array contents according to Arrays.deepToString(): " + ans);
	System.out.println("Array contents according to my 2D arrToString(): " + myAns);
	System.out.println("Same contents: " + ans.equals(myAns));
	
	//Both of the above methods were more thoroughly tested in a previous class.
	
	//Testing countZeros2D()
	System.out.println('\n' + "TESTING COUNTZEROS2D():");
	int[][] count1 = new int[3][4];
	ans = "12";
	myAns = countZeros2D(count1) + ""; //turn the answer into a string for comparison
	System.out.println("Array: " + Arrays.deepToString(count1));
	System.out.println(arrow + "Intended count of zeroes: " + ans);
	System.out.println(arrow + "Function returned: " + myAns);
	System.out.println(arrow + "Same value: " + ans.equals(myAns));
	int[][] count2 = {{0}, {-1}, {9, 0, 0, 876, -3889}};
	ans = "3";
	myAns = countZeros2D(count2) + ""; //turn the answer into a string for comparison
	System.out.println("Array: " + Arrays.deepToString(count2));
	System.out.println(arrow + "Intended count of zeroes: " + ans);
	System.out.println(arrow + "Function returned: " + myAns);
	System.out.println(arrow + "Same value: " + ans.equals(myAns));
	
	//Testing htmlTable()
	System.out.println('\n' + "TESTING HTMLTABLE():");
	int[][] html1 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
	System.out.println("Array: " + Arrays.deepToString(html1));
	System.out.println("HTML Table: " + htmlTable(html1));
	int[][] html2 = {{0}, {-1, -97864, 5896}, {2, 3}};
	System.out.println("Array: " + Arrays.deepToString(html2));
	System.out.println("HTML Table: " + htmlTable(html2));
	
	//arr2DSum(), replaceNegative(), 1D copy() and 2D copy(), and swapRC were all tested in a previous class and copy-pasted from there.
	
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] nums) {
    String fin = "[";
    for (int i = 0; i < nums.length; i++) {
      fin += nums[i] + "";
      if (i < nums.length - 1) {
        fin += ", ";
      }
    }
    return fin + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary) {
    String fin = "[";
	for (int i = 0; i < ary.length; i++) {
	  fin += arrToString(ary[i]);
	  if (i < ary.length - 1) {
		fin += ", ";
	  }
	}
	return fin + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums) {
    int count = 0;
	for (int i = 0; i < nums.length; i++) {
	  for (int j = 0; j < nums[i].length; j++) {
		if (nums[i][j] == 0) {
		  count++;
		}
	  }
	}
	return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums) {
    int sum = 0;
 	for (int i = 0; i < nums.length; i++) { //loops through the first dimension of the 2D array
 	  for (int j = 0; j < nums[i].length; j++) { //loops through the second dimension of the 2D array
 		sum += nums[i][j];
 	  }
 	}
 	return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
	for (int i = 0; i < vals.length; i++) {
	  for (int j = 0; j < vals[i].length; j++) {
		if (vals[i][j] < 0) {
		  int replace = 0;
		  if (i == j) {
			replace++;
		  }
		  vals[i][j] = replace;
		}
	  }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] fin = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      fin[i] = copy(nums[i]);
    }
    return fin;
  }

  //Helper function for the above copy() function; copies a 1D array
  public static int[] copy(int[] nums) {
    int[] fin = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      fin[i] = nums[i];
    }
    return fin;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums) {
  int[][] swap = new int[nums[0].length][nums.length];
  for (int i = 0; i < swap.length; i++) {
    for (int j = 0; j < swap[i].length; j++) {
      swap[i][j] = nums[j][i];
    }
  }
  return swap;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}}) returns:
  //   "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums) {
    String table = "<table>";
	for (int i = 0; i < nums.length; i++) {
	  table += htmlRow(nums[i]);
	}
	return table + "</table>";
  }
  
  public static String htmlRow(int[] nums) { //helper method for the above htmlTable() method
	String row = "<tr>";
	for (int i = 0; i < nums.length; i++) {
	  row += "<td>" + nums[i] + "</td>";
	}
	return row + "</tr>";
  }

}

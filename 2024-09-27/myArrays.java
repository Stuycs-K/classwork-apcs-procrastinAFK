public class myArrays {

  public static void main(String[] args) {

    //testing aryToString()
    System.out.println('\n' + "TESTING ARYTOSTRING():");
    int[] test1 = {0, 1, 2, 3};
    int[] test2 = {0};
    int[] test3 = {};
    System.out.println("ID: " + test1 + "; array should be: [0, 1, 2, 3]; array: " + aryToString(test1));
    System.out.println("ID: " + test2 + "; array should be: [0]; array: " + aryToString(test2));
    System.out.println("ID: " + test3 + "; array should be: []; array: " + aryToString(test3));

    //testing returnCopy()
    System.out.println('\n' + "TESTING RETURNCOPY():");
    int[] newTest = returnCopy(test1);
    System.out.println("Original array: " + aryToString(test1));
    System.out.println("Copied array: " + aryToString(newTest));
    System.out.println("Same array ID: " + (test1 == newTest));
    //change the first array, just to be safe
    test1[0] = 9999999;
    System.out.println("Just in case, changed original array to: " + aryToString(test1));
    System.out.println("The copied array (should remain as it was) is now: " + aryToString(newTest));
    int[] emptyAry = returnCopy(test3);
    System.out.println("Testing an empty array: Copied array: " + aryToString(emptyAry) + "; Same array ID: " + (test3 == emptyAry));

    //testing concatArray()
    System.out.println('\n' + "TESTING CONCATARRAY():");
    test1 = new int[]{0, 1, 2, 3};
    test2 = new int[]{4};
    int[] concatAry = concatArray(test1, test2);
    System.out.println("First array: " + aryToString(test1) + "; second array: " + aryToString(test2) + "; concatenated: " + aryToString(concatAry));
    concatAry = concatArray(test1, test3); //testing concatenating an empty array
    System.out.println("First array: " + aryToString(test1) + "; second array: " + aryToString(test3) + "; concatenated: " + aryToString(concatAry));
    System.out.println("Testing \"same\" arrays:");
    //testing copies
    System.out.println(" - Copy cases:");
    newTest = returnCopy(test1);
    concatAry = concatArray(test1, newTest);
    System.out.println("   + First array: " + aryToString(test1) + "; copy (using returnCopy()): " + aryToString(newTest) + "; concatenated: " + aryToString(concatAry));
    newTest = returnCopy(test3);
    concatAry = concatArray(test3, newTest);
    System.out.println("   + First array: " + aryToString(test3) + "; copy (using returnCopy()): " + aryToString(newTest) + "; concatenated: " + aryToString(concatAry));
    //testing the same array twice
    System.out.println(" - Actually duplicating the same array:");
    concatAry = concatArray(test1, test1);
    System.out.println("   + Array to be duplicated: " + aryToString(test1) + "; concatenated: " + aryToString(concatAry));
    concatAry = concatArray(test3, test3);
    System.out.println("   + Array to be duplicated: " + aryToString(test3) + "; concatenated: " + aryToString(concatAry));

  }

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

  public static int[] returnCopy(int[] ary) {
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      newAry[i] = ary[i];
    }
    return newAry;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] ary12 = new int[ary1.length + ary2.length];
    int[] curArray = ary1;
    int startInd = 0;
    for (int aryNum = 1; aryNum < 3; aryNum++) { //do the following for 2 arrays (ary1, ary2)
      int curLen = curArray.length;
      for (int i = 0; i < curLen; i++) { //for each array
        ary12[i + startInd] = curArray[i];
      }
      curArray = ary2;
      startInd = ary1.length; //the first index to concat the second array is equal to the length of the first array
    }
    return ary12;
  }

}

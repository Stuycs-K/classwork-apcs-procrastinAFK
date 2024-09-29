public class myArrays {

  public static void main(String[] args) {
    int[] test = {0,91,76,8235};
    System.out.println("Original array: " + aryToString(test));
    int[] newTest = returnCopy(test);
    System.out.println("Copied array: " + aryToString(newTest));
    System.out.println("Same array ID: " + (test == newTest));
    test[0] = 9999999;
    System.out.println("Just in case, changed original array to: " + aryToString(test));
    System.out.println("The copied array is now: " + aryToString(newTest));
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

  //public static int[] concatArray(int[] ary1, int[] ary2) {}

}

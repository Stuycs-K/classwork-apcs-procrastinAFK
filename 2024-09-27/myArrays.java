public class myArrays {
  public static void main(String[] args) {
    int[] test = {0,91,76,8235};
    System.out.println(test);
  }
  public static String aryToString(int[] nums) {
    String final = "[";
    for (int i = 0; i < nums.length; i++) {
      final += nums[i] + "";
      if (i < nums.length - 1) {
        final += ", ";
      }
    }
    return final;
  }
  //public static int[] returnCopy(int[] ary) {}
  //public static int[] concatArray(int[] ary1, int[] ary2) {}
}

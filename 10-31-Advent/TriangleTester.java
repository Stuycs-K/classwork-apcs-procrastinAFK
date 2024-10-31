public class TriangleTester {

  public static int countTrianglesA(String filename) {
    //do file parsing
    return 0; //so it can compile
  }

  public static boolean isTriangle(ArrayList<Integer> sides) {
    boolean isTri = true;
    for (int i = 0; i < sizes.size() && isTri; i++) {
      if (sizes.get(i) + sides.get(i + 1) <= sides.get(i + 2)) {
        isTri = false;
      }
    }
    return isTri;
  }
}

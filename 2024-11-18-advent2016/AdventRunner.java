public class AdventRunner {
	public static void main(String[] args) {
		System.out.println("Number of valid triangles by row: " + TriangleTester.countTrianglesA("inputTri.txt"));
		System.out.println("Number of valid triangles by column (3 nums at a time): " + TriangleTester.countTrianglesB("inputTri.txt"));
		
		System.out.println("\n");
		System.out.println(Day1.blocksAway("inputDay1.txt"));
	}
}
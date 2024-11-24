public class AdventRunner {
	public static void main(String[] args) {
		System.out.println(TriangleTester.countTrianglesA("inputTri.txt"));
		System.out.println(TriangleTester.countTrianglesB("inputTri.txt"));
		
		System.out.println("\n");
		System.out.println(fileParser.parseFile("inputDay1.txt"));
		System.out.println(Day1.blocksAway("inputDay1.txt"));
	}
}
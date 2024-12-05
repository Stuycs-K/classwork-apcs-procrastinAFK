public class Driver {
	
	public static void main(String[] args) {
		System.out.println(Text.CLEAR_SCREEN);
		System.out.print(Text.HIDE_CURSOR);
		String cols = "\033[" + Text.background(Text.RED) + "m";
		printBorder(cols, " ", new int[]{1,1}, 80, 30);
		System.out.println(Text.RESET);
		Text.go(31, 1); //move cursor so that we don't write over our border
		System.out.print(Text.SHOW_CURSOR);
	}
	
	
	//Helper functions
	public static void printBorder(String cols, String borderChar, int[] startPos, int length, int width) {
		for (int row = 0; row < width; row++) {
			
			//print a border char at the start of each row
			System.out.print(cols);
			Text.go(startPos[0] + row, startPos[1]);
			System.out.print(borderChar);
			
			//decide what to print for the rest of the row
			String printChar = borderChar;
			if (!(row == 0 || row == width - 1)) {
				System.out.print(Text.RESETCOL);
				printChar = " ";
			}
			
			//print the rest of the row except for the final character
			for (int column = 1; column < length - 1; column++) {
				Text.go(startPos[0] + row, startPos[1] + column);
				System.out.print(printChar);
			}
			
			//print the final character for each row
			System.out.print(cols);
			Text.go(startPos[0] + row, startPos[1] + length - 1);
			System.out.print(borderChar);
			
		}
	}
}
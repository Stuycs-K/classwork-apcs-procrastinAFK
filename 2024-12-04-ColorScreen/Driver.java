import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println(Text.CLEAR_SCREEN);
		System.out.print(Text.HIDE_CURSOR);
		
		//set up border
		int cols = Text.background(Text.RED);
		printBorder(cols, " ", new int[]{1,1}, 80, 30);
		
		//display 3 random (0-99) integers evenly (ish) spaced within the border
		//setup
		Text.go(2,2);
		int[] rands = makeRandArr(3, 100, 0);
		String spacing = "                                    "; //36 spaces
		//do the actual printing
		for (int i = 0; i < 3; i++) {
			int toPrint = rands[i];
			if (i > 0) System.out.print(spacing);
			if (toPrint < 25) Text.color(Text.RED, Text.BRIGHT);
			if (toPrint > 75) Text.color(Text.GREEN, Text.BRIGHT);
			System.out.print(toPrint);
			Text.color(0);
		}
		//Print a horizontal border
		printBorder(cols, "-", new int[]{3,2}, 78, 1);
		
		//back to normal
		System.out.println(Text.RESET);
		Text.go(31, 1); //move cursor so that we don't write over our border
		System.out.print(Text.SHOW_CURSOR);
	}
	
	
	
	//Helper functions
	public static void printBorder(int cols, String borderChar, int[] startPos, int length, int width) {
		for (int row = 0; row < width; row++) {
			
			//print a border char at the start of each row
			Text.color(cols);
			Text.go(startPos[0] + row, startPos[1]);
			System.out.print(borderChar);
			
			//decide what to print for the rest of the row
			String printChar = borderChar;
			if (!(row == 0 || row == width - 1)) {
				Text.color(0);
				printChar = " ";
			}
			
			//print the rest of the row except for the final character
			for (int column = 1; column < length - 1; column++) {
				Text.go(startPos[0] + row, startPos[1] + column);
				System.out.print(printChar);
			}
			
			//print the final character for each row
			Text.color(cols);
			Text.go(startPos[0] + row, startPos[1] + length - 1);
			System.out.print(borderChar);
			
		}
		
		Text.color(0);
	}
	
	
	public static int[] makeRandArr(int size, int range, int min) {
		int[] randArr = new int[3];
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = (int) (Math.random() * range) + min;
		}
		return randArr;
	}

}
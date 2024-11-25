import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2 {
	
	public static String roomCode(String filename) { //must include the file extension
	
		ArrayList<String[]> instructions = fileParser.parseFile2D(filename);
		String code = "";
		
		String[][] keypad = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
		int[] button = {1,1}; //row, column. This represents button #5.
		
		for (int rowNum = 0; rowNum < instructions.size(); rowNum++) {
			
			String[] row = instructions.get(rowNum);
			move(row, button);
			
			int buttonRow = button[0];
			int buttonColumn = button[1];
			code += keypad[buttonRow][buttonColumn];
			
		}
		return code;
	}
	
	
	public static void move(String[] text, int[] button) {
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals("U")) {button[0]--;}
			if (text[i].equals("D")) {button[0]++;}
			if (text[i].equals("L")) {button[1]--;}
			if (text[i].equals("R")) {button[1]++;}
			keepInBounds(button);
		}
	}
	
	
	public static void keepInBounds(int[] button) {
		for (int i = 0; i < 2; i++) {
			if (button[i] < 0) {
				button[i] = 0;
			}
			if (button[i] > 2) {
				button[i] = 2;
			}
		}
	}
	
}
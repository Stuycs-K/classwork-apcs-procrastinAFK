import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6 {
	
	public static String codeBreaker(String filename) { //must include file extension
		ArrayList<String[]> message = fileParser.parseFile2D(filename);
		String code = "";
		
		for (int column = 0; column < message.get(0).length; column++) {
			
			ArrayList<String> codeChars = new ArrayList<String>();
			for (int row = 0; row < message.size(); row++) {
				codeChars.add(message.get(row)[column]);
			}
			
			code += mostChar(codeChars);
		}
		return code;
	}
	
	public static String mostChar(ArrayList<String> chars) {
		
		ArrayList<String> diffChars = new ArrayList<String>();
		for (int i = 0; i < chars.size(); i++) {
			String thisChar = chars.get(i);
			if (! diffChars.contains(thisChar)) {
				diffChars.add(thisChar);
			}
		}
		
		String curChar = "";
		int highCount = 0;
		
		for (int i = 0; i < diffChars.size(); i++) {
			String thisChar = diffChars.get(i);
			if (count(chars, thisChar) > highCount) {
				curChar = thisChar;
				highCount = count(chars, thisChar);
			}
		}
		
		return curChar;
	}
	
	
	public static int count(ArrayList<String> chars, String thisChar) {
		int count = 0;
		for (int i = 0; i < chars.size(); i++) {
			if (chars.get(i).equals(thisChar)) {
				count++;
			}
		}
		return count;
	}

}
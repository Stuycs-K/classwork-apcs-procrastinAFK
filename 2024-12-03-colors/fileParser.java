import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class fileParser {
	
	public static ArrayList parseFile(String filename) { //must include file extension
		ArrayList<String> contents = new ArrayList<String>();
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			input.useDelimiter("\n");
			while (input.hasNext()){
				String item = input.next();
				if (item.contains(",")) {
					item = item.replace(",", "");
				}
				contents.add(item);
			}
			input.close();
		} catch(FileNotFoundException ex) {
			System.out.println("File not found!");
        }
		return contents;
	}

	public static ArrayList parseFile2D(String filename) { //must include file extension
		ArrayList<ArrayList<String>> contents = new ArrayList<ArrayList<String>>();
		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] lineList = line.split(" ");
				contents.add(new ArrayList<String>(Arrays.asList(lineList)));
			}
			input.close();
		} catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		return contents;
	}

}

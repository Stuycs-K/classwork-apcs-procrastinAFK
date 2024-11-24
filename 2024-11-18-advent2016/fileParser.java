import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class fileParser {
	public static ArrayList parseFile(String filename) { //must include file extension
		ArrayList<String> contents = new ArrayList<String>();
		try {
            File file = new File(filename);
			Scanner input = new Scanner(file);
			while (input.hasNext()){
				contents.add(input.next());
			}
			input.close();
		} catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		return contents;
	}
}
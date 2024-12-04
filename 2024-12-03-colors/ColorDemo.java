import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ColorDemo {
	
	public static final String CLEAR_SCREEN =  "\u001b[2J";
	public static final String HIDE_CURSOR =  "\u001b[?25l";
	public static final String SHOW_CURSOR =  "\u001b[?25h";
	public static final String RESET = "\u001b[0m";
	
	public static String RED = "\u001b[91m";
	public static String GREEN = "\u001b[92m";
	public static String WHITE = "\u001b[97m";

    public static void main(String[] args) {
		
		String text = RED;
		System.out.print(HIDE_CURSOR);
		
		ArrayList<String> lyrics = fileParser.parseFile("mariahcarey.txt");
		
		lyrics.add(0,"\n*music starts playing*\n");
		lyrics.add(0, "Press enter in time to Mariah Carey's \"All I Want For Christmas Is You\" for Christmas color themed lyrics!\n\n\n");
		
		for (int i = 0; i < lyrics.size(); i++) {
			String newtxt = lyrics.get(i);
			String[] txtline = newtxt.split(" ");
			for (int j = 0; j < txtline.length; j++) {
				System.out.print(CLEAR_SCREEN);
				System.out.print(text + " ");
				System.out.print(GREEN);
				System.out.print(txtline[j]);
				System.out.print(" " + RESET);
				text += " " + txtline[j];
				Scanner scan = new Scanner(System.in);
				String readString = scan.nextLine(); //detects when someone hits the enter key
			}
			text += "\n\n";
		}
		
		System.out.print(CLEAR_SCREEN);
		System.out.print(text + " ");
		
		System.out.print(RESET);
		System.out.print(SHOW_CURSOR);
	}
	
}

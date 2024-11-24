import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day1 {

	public static int blocksAway(String filename) { //filename = name of input file
		int distance = 0;
		String dir = "N";
		ArrayList<String> directions = fileParser.parseFile(filename);
		for (int i = 0; i < directions.size(); i++) {
			String thisDir = directions.get(i);
			String turn = thisDir.substring(0,1); //first char = direction to turn
			dir = changeDir(dir, turn);
			int blocks = Integer.parseInt(thisDir.substring(1));
			distance += moveBlocks(dir, blocks);
		}
		return Math.abs(distance);
	}
	
	
	public static String changeDir(String dir, String turn) { //dir = N, E, S, or W; turn = L or R
		String compass = "wNESWne"; //capitalization difference to help with indexOutOfBounds errors
		int curDir = compass.indexOf(dir);
		if (turn.equals("L")) {
			return compass.substring(curDir - 1, curDir).toUpperCase();
		}
		return compass.substring(curDir + 1, curDir + 2).toUpperCase();
	}
	
	
	public static int moveBlocks(String dir, int num) {
		int sign = 1;
		if (dir.equals("W") || dir.equals("S")) {
			sign = -1;
		}
		return num * sign;
	}

}
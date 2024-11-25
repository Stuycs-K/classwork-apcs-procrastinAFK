import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day1 {

	public static int blocksAway(String filename) { //filename = name of input file
	
		int distance = 0;
		String dir = "N";
		ArrayList<String> directions = fileParser.parseFile(filename);
		
		ArrayList<String> visited = new ArrayList<String>();
		int[] curCoords = new int[]{0,0};
		visited.add(coords(curCoords));
		boolean samespot = false;
		
		for (int i = 0; i < directions.size(); i++) {
			
			//distance calc stuff
			String thisDir = directions.get(i);
			String turn = thisDir.substring(0,1); //first char = direction to turn
			dir = changeDir(dir, turn);
			int blocks = Integer.parseInt(thisDir.substring(1));
			distance += moveBlocks(dir, blocks);
			
			//visited before stuff
			if (! samespot) {
				visited = newVisiteds(visited, curCoords, dir, blocks);
				if (visited.size() == 1) {
					samespot = true;
				}
			}
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
	
	
	public static String coords(int[] curCoords) {
		return "(" + curCoords[0] + "," + curCoords[1] + ")";
	}
	
	
	public static ArrayList newVisiteds(ArrayList<String> visited, int[] curCoords, String dir, int blocks) {
		blocks = moveBlocks(dir, blocks);
		int increment = blocks / Math.abs(blocks); //decides if the increment should be -1 or 1
		int coordInd = 0;
		if (dir.equals("N") || dir.equals("S")) {
			coordInd = 1;
		}
		for (int i = 0; i < Math.abs(blocks); i++) {
			curCoords[coordInd] += increment;
			String strCoords = coords(curCoords);
			if (visited.contains(strCoords)) {
				System.out.println("First spot visited twice is this many blocks away: " + (Math.abs(curCoords[0]) + Math.abs(curCoords[1])) + " at " + strCoords);
				visited = new ArrayList<String>();
				visited.add(strCoords);
				return visited;
			}
			visited.add(strCoords);
		}
		return visited;
	}

}
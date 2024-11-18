import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> randomarray = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int temp = (int)(Math.random() * 11);
      String Temp = "";
      if (temp != 0){
        Temp += temp;
      }
      randomarray.add(Temp);
    }
    return randomarray;
  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i) == "") {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> revArr = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      revArr.add(original.get(i));
    }
    return revArr;
  }
  
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
	ArrayList<String> finList = new ArrayList<String>(a.size() + b.size());
	for (int i = 0; i < a.size() && i < b.size(); i++) {
	  finList.add(a.get(i));
	  finList.add(b.get(i));
	}
	for (int i = 0; i < a.size(); i++) { //executes if a is larger than b and therefore isn't size 0 by now
	  finList.add(a.get(i));
	}
	for (int i = 0; i < b.size(); i++) { //executes if b is larger than a and therefore isn't size 0 by now
	  finList.add(b.get(i));
	}
	
  } 

}
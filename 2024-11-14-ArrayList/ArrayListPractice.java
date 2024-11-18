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

}
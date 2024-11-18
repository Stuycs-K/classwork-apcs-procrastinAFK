import java.util.*;

public class Driver{
  public static void main(String[] args){
    //testing createRandomArray
    System.out.println(ArrayListPractice.createRandomArray(0));
    System.out.println(ArrayListPractice.createRandomArray(10));
    System.out.println(ArrayListPractice.createRandomArray(1));
    System.out.println(ArrayListPractice.createRandomArray(50));

    //testing replaceEmpty
    System.out.println("\n");
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(5);
    System.out.print(test1 + " --> ");
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(0);
    System.out.print(test2 + " --> ");
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test2);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(200000);
    System.out.print(test3 + " --> ");
    ArrayListPractice.replaceEmpty(test3);
    System.out.println(test3);

    //testing makeReversedList
    System.out.println("\n");
    System.out.println(test2 + " --> " + ArrayListPractice.makeReversedList(test2));
    System.out.println(test1 + " --> " + ArrayListPractice.makeReversedList(test1));
    System.out.println(test3 + " --> " + ArrayListPractice.makeReversedList(test3));
	
	//testing mixList
    System.out.println("\n");
	String[] test4 = new String[]{"1","3","5"};
	String[] test5 = new String[]{"2","4","6","8","10"};
	System.out.println(Arrays.toString(test4) + " + " + Arrays.toString(test5) + " --> " + ArrayListPractice.mixLists(new ArrayList<String>(Arrays.asList(test4)), new ArrayList<String>(Arrays.asList(test5))));
	test4 = new String[]{"1","3","5","7","9"};
	System.out.println(Arrays.toString(test4) + " + " + Arrays.toString(test5) + " --> " + ArrayListPractice.mixLists(new ArrayList<String>(Arrays.asList(test4)), new ArrayList<String>(Arrays.asList(test5))));
	test5 = new String[]{"2","4"};
	System.out.println(Arrays.toString(test4) + " + " + Arrays.toString(test5) + " --> " + ArrayListPractice.mixLists(new ArrayList<String>(Arrays.asList(test4)), new ArrayList<String>(Arrays.asList(test5))));
	test5 = new String[]{};
	System.out.println(Arrays.toString(test4) + " + " + Arrays.toString(test5) + " --> " + ArrayListPractice.mixLists(new ArrayList<String>(Arrays.asList(test4)), new ArrayList<String>(Arrays.asList(test5))));
  }
}
import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    System.out.println(ArrayListPractice.createRandomArray(10));
    System.out.println(ArrayListPractice.createRandomArray((int)(Math.random()*10)));
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(10);
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    System.out.println(ArrayListPractice.makeReversedList(test1));
    // ArrayList<String> test =  ArrayListPractice.createRandomArray(5);
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(5); // equal
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(8);
    ArrayListPractice.replaceEmpty(test2);
    ArrayListPractice.replaceEmpty(test3);
    System.out.println("test2: " + test2);
    System.out.println("test3: " + test3);
    System.out.println(ArrayListPractice.mixLists(test2, test3));
  }
}

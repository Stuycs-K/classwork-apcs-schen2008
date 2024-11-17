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
  }
}

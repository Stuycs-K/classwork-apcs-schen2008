import java.util.ArrayList;

public class ArrayListPractice{
  // Write a method public static ArrayList<String>createRandomArray(int size)
  // Create and return an ArrayList of the specified size that is randomly filled. Fill it with strings that look like the integers from 0 to 10 or similar,
  // but make every 0 turn into the empty string "". Do not make very long numbers that are difficult to read. You shoudl use Math.random()
  public static ArrayList<String> createRandomArray (int size){
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < size; i++){
      int x = (int)(11 * Math.random()); //this takes away very small chance that we get 11
      if (x == 0){
        result.add("");
      }
      else{
        result.add("" + x);
      }
    }
    return result;
  }
}

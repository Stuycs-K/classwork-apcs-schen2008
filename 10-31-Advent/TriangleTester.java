import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    int counter = 0;
    try{
      File input = new File(filename);
      Scanner file = new Scanner(input);
      while(file.hasNextLine()){
        String[] sides = file.nextLine().split(" ");
        int a = Integer.parseInt(sides[0]);
        int b = Integer.parseInt(sides[1]);
        int c = Integer.parseInt(sides[2]); 
        if(a < b+c && b < a+c && c < a+b){
          counter++;
        }
    }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return counter;
  }
  public static int countTrianglesB(String filename){
    int counter = 0;
    try{
      File input = new File(filename);
      Scanner file = new Scanner(input);
      while(file.hasNextLine()){
        String[] row1 = file.nextLine().split(" ");
        String[] row2 = file.nextLine().split(" ");
        String[] row3 = file.nextLine().split(" ");
        for(int i = 0; i < 2; i++){
          int a = Integer.parseInt(row1[i]);
          int b = Integer.parseInt(row2[i]);
          int c = Integer.parseInt(row3[i]);
          if(a < b+c && b < a+c && c < a+b){
            counter++;
        }  
      }
      
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    /*
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);
      Scanner sc = new Scanner("Some String (or File) Here");
      Scanner sc1 = new Scanner("This is a bunch of words");
      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
      //you don't want a for loop here unless you know the size of the data set

      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }
      while(input.hasNextLine()){
        System.out.println(input.nextLine());
        //do something with the next line of the file
      }
      double sum = 0;
      while(sc2.hasNextDouble()){
        sum+=sc2.nextDouble();//read all the numbers and add to sum
      }
      System.out.println(sum);
      */
    }

}

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    int counter = 0;
    try{
      File input = new File(filename);
      Scanner file = new Scanner(input);
        while(file.hasNextInt()){
          int a = file.nextInt();
          int b = file.nextInt();
          int c = file.nextInt(); 
          if(a < b+c && b < a+c && c < a+b){
            counter++;
          }
        }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return counter;
  } 
  public static boolean isTriangle(int a, int b, int c){
    {
      if(a < b+c && b < a+c && c < a+b){
        return true;
    }  
    return false;
    }
  }
  public static int countTrianglesB(String filename){
    int counter = 0;
    try{
      File input = new File(filename);
      Scanner file = new Scanner(input);
      while(file.hasNextInt()){
        int a1 = file.nextInt();
        int a2 = file.nextInt();
        int a3 = file.nextInt();
        int b1 = file.nextInt();
        int b2 = file.nextInt();
        int b3 = file.nextInt();
        int c1 = file.nextInt();
        int c2 = file.nextInt();
        int c3 = file.nextInt();
        if(isTriangle(a1,b1,c1)){
          counter++;
        }
        if(isTriangle(a2,b2,c2)){
          counter++;
        }
        if(isTriangle(a3,b3,c3)){
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
    System.out.println(countTrianglesB("inputTri.txt"));
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

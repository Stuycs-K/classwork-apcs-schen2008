import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String nline = input.nextLine();
        if (nline.contains("{")) {
          //make a variable and then save it and then print that
          System.out.println(nline);
        }
      }
      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}

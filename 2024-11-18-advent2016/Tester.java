import java.util.*;
import java.io.*;

public class Tester{
  private int x,y;
  public static void main(String[] args){
    distance("input.txt");
  }
  public static int distance(String filename){
    try{
    File input = new File(filename);
    Scanner file = new Scanner(input);
    // int[] direction = {0,1,2,3}; // North 0, East 1, South 2, West 3;
    int x = 0;
    int y = 0;
    int i = 0;
    int direc = 0;


      while(file.hasNextLine()){
            String[] directions = file.nextLine().split("");
            while(i<directions.length){ // maybe try making an array instead using split(", "), change the direction array to go forward or backward depending on L/R at the input
              if(directions[i].substring(0,1).equals("L")){
                direc = (direc - 1)%4;
              }
              if(directions[i].substring(0,1).equals("R")){
                direc = (direc + 1)%4;
              }
              if(direc == 0) x+=Integer.parseInt(directions[i].substring(1));
              if(direc == 1) x-=Integer.parseInt(directions[i].substring(1));
              if(direc == 2) y+=Integer.parseInt(directions[i].substring(1));
              if(direc == 3) y-=Integer.parseInt(directions[i].substring(1));
              i++;
            }
          }
        }catch(FileNotFoundException e){
          System.out.println("File not found");
          return -1;
        }
        return x + y;
  }
}

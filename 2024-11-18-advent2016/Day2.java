import java.util.*;
import java.io.*;

public class Day2{
  public static void main(String[] args){
    pt1("day2input.txt");
  }
  public static void pt1(String filename){
    int[][] keypad = {{1,2,3},{4,5,6},{7,8,9}};
    int i = 1;
    int z = 1;
    ArrayList<Integer> tracker = new ArrayList<Integer>();
    try{
        File input = new File(filename);
        Scanner file = new Scanner(input);

        while(file.hasNextLine()){
            String[] directions = file.nextLine().split("");
            for(int f = 0; f < directions.length; f++){
                if(directions[f].equals("U")) i--;
                if(directions[f].equals("D")) i++;
                if(directions[f].equals("L")) z--;
                if(directions[f].equals("R")) z++;
                if(i < 0) i++;
                if(i>2) i--;
                if(z < 0) z++;
                if(z>2) z--;
            }
            tracker.add(keypad[i][z]);
        }

    }catch(FileNotFoundException e){
        System.out.println("File not found");
    }
    int a = tracker.size();
    int u = 0;
    for(int j = 0; j < tracker.size(); j++){
        u += Math.pow(10,a) * tracker.get(j);
        a--;
        System.out.println(tracker.get(j));
    }
  }

}
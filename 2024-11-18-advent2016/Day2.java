import java.util.*;
import java.io.*;

public class Day2{
  public static void main(String[] args){
    //pt1("day2input.txt");
    System.out.println(pt2("day2input.txt"));
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
    public static String pt2(String filename){
        String[][] keypad = {
        {"0","0","1","0","0"},
        {"0","2","3","4","0"},
        {"5","6","7","8","9"},
        {"0", "A", "B", "C", "0"},
        {"0","0","D","0","0"}};
        int row = 2;
        int column = 0;
        ArrayList<String> tracker = new ArrayList<String>();
        try{
            File input = new File(filename);
            Scanner file = new Scanner(input);
            while(file.hasNextLine()){
                String[] directions = file.nextLine().split("");
                for(int i = 0; i < directions.length; i++){
                    if(directions[i].equals("U"))
                    {
                        if(row > 0 && !(keypad[row-1][column].equals("0"))){
                            row--;
                        }
                    }
                    if(directions[i].equals("D")){
                        {
                            if(row < 4 && !(keypad[row+1][column].equals("0"))){
                                row++;
                            }
                        }
                    }
                    if(directions[i].equals("L")){
                        {
                            if(column > 0 && !(keypad[row][column-1].equals("0"))){
                                column--;
                            }
                        }
                    } 
                    if(directions[i].equals("R")){
                        {
                            if(column < 4 && !(keypad[row][column+1].equals("0"))){
                                column++;
                            }
                        }
                    }
                    System.out.println(row + " " + column);
                }

                tracker.add(keypad[row][column]);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return "File Not Found";
        }
        return tracker.toString();
  } 

}
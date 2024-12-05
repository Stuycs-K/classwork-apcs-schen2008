public class Driver{
    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        int width = 80;
        int height = 31;
        drawBorder(width, height);
        int[] nums = randArray();
        int column = 0;
        drawSeperator(height/2,width);
        for(int i = 0; i < 3; i++){
            column += (int) 78/4;
            if(nums[i] < 25){
                Text.color(Text.BRIGHT, Text.RED, Text.background(Text.BLACK));
            }
            else if(nums[i] > 75){
                Text.color(Text.BRIGHT, Text.GREEN, Text.background(Text.BLACK));
            }
            else{
                Text.color(Text.WHITE);
            }
            Text.go(2, column);
            System.out.println(nums[i]);
            if(column < 25){
                for(int h = 3; h < 27; h++){
                    Text.go(h,column);
                    Text.color(Text.BRIGHT, Text.RED);
                    System.out.println("||");
                }
            }
            else if(column > 25 && column < 50){
                for(int z = 3; z < 27; z++){
                    Text.go(z,column);
                    Text.color(Text.BRIGHT, Text.GREEN);
                    System.out.println("||");
                }
            }
            else{
                for(int f = 3; f < 27; f++){
                    Text.go(f,column);  
                    Text.color(Text.BRIGHT, Text.BLUE);
                    System.out.println("||");
                }
            }
            Text.go(31,0);
            System.out.print(Text.RESET);
        }



    }
    public static void drawBorder(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int z = 1; z <= width; z++) {
                if ((i == 1 || i == height) || (z == 1 || z == width)) {
                    Text.go(i, z);
                    Text.color(Text.BLACK, Text.background(Text.WHITE));
                    System.out.print(".");
                }
            }
        }
    }
    public static int[] randArray(){
        int[] result = new int[3];
        for(int i = 0; i < 3; i++){
            result[i] = (int)(Math.random()*100);
        }
        return result;
    }
    public static void drawSeperator(int row, int width){
        for(int i = 0; i <= width-1;i++){
            Text.go(row, i);
            Text.color(Text.BLACK, Text.background(Text.WHITE));
            System.out.println("=");
        }

    }
}
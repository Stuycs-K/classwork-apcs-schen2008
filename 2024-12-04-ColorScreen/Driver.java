public class Driver{
    public static void main(String[] args){
        int width = 90;
        int height = 30;
        drawBorder(width, height);

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
        for(int i = 0; i < 2; i++){
            result[i] = (int)Math.random()*100;
        }
        return result;
    }
}
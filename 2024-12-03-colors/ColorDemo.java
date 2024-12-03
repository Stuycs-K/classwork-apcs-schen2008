public class ColorDemo{
  public static void main(String[] args){
    for(int i = 0; i < 257; i++){
      int r = 0;
      int b = 0;
      int g = 0;
      System.out.println("\u001b[" + r + ";" + g + ";" b + ";m");
    }
  }
}

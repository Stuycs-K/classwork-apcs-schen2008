public class ColorDemo{
  public static void main(String[] args){
    int x = 31;
    for(int i = 0; i < 7; i++){
      System.out.print("\u001b[" + x + "m");
      System.out.println("This is a different color from above");
      x++;
    }
    x--;
    for(int i = 0; i < 6; i++){
      System.out.print("\u001b[" + (x+10) + "m");
      System.out.print("diff");
      x--;
    }
    System.out.print("\u001b[0m");
    System.out.println("We are going back to normal");
    System.out.print("\u001b[2J");
    System.out.println("scroll up, screen was cleared");
    for(int i = 0; i < 6; i++){
      System.out.print("\u001b[" + (x+10) + "m");
      System.out.print("\u001b[" + (x+10) + "7m");
      System.out.print("reversing text to background");
      System.out.println("\u001b[0m");
      System.out.print("Back to normal again");

      x++;
    }
  }
}

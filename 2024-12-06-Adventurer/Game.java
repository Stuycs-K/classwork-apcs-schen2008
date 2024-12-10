import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    // Username
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);

    //Creation of characters
    Adventurer p1 = new Swordsman(userName);
    Adventurer p2 = new CodeWarrior("APCS Goon");

    //Game code
    while(1 == 1){
      System.out.println("Player: " + p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP" + ", " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println("Enemy: " + p2.getName() + ", " + p2.getHP() + "/" +  p2.getmaxHP() + " HP" + ", " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
      System.out.println("Type:  (a)ttack / (sp)ecial / (su)pport / quit");
      if(p1.getHP() <= 0){
        System.out.println("APCSGoon has defeated " + p1.getName());
        return;
      }
      else if (p2.getHP() <= 0){
        System.out.println("You win!");
        return;
      }
        String action = userInput.nextLine();
        if(action.equals("a") || action.equals("attack")){
          System.out.println(p1.attack(p2));
        }
        else if(action.equals("sp") || action.equals("special")){
          System.out.println(p1.specialAttack(p2));
        }
        else if(action.equals("su") || action.equals("support")){
          System.out.println(p1.support());
        }
        else if(action.equals("quit")){
          System.out.println("User has ended simulation");
          return;
        }
        else{
          System.out.println("Please enter a valid action");
        }
        if(p1.getHP() <= 0){
          System.out.println("APCSGoon has defeated " + p1.getName());
          return;
        }
        else if (p2.getHP() <= 0){
          System.out.println("You win!");
          return;
        }
        int botaction = (int) Math.random()*2;
        if(botaction == 0){
          System.out.println(p2.attack(p1));
        }
        else if(botaction == 1){
          System.out.println(p2.specialAttack(p1));
        }
        else if(botaction == 2){
          System.out.println(p2.support());
        }
    }
  }

}

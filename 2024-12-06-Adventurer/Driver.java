public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Swordsman("Sasaki");
        Adventurer p2 = new Swordsman("Musashi");
        System.out.println("Duel: ");
        System.out.println(p1.getName() + "'s Current HP: " + p1.getHP());
        System.out.println(p2.getName() + "'s Current HP: " + p2.getHP());

        System.out.println("\nExchange of Basic Blows(attack):");
        System.out.println(p1.attack(p2));
        System.out.println(p2.getName() + " now has " + p2.getHP() + " HP.");
        System.out.println(p2.attack(p1));
        System.out.println(p1.getName() + " now has " + p1.getHP() + " HP.");

        System.out.println("\nHealing(support):");
        System.out.println(p2.support());
        System.out.println(p2.getName() + " now has " + p2.getHP() + " HP.");
        System.out.println(p1.getName() + " accidentally spilled his health potion on " + p2.getName() + "!" + p1.support(p2));
        System.out.println("\n" + p2.getName() + " now has " + p2.getHP() + " HP.");
        System.out.println(p1.getName() + " now has " + p1.getHP() + " HP.");

        System.out.println("\nExchange of Qi Sword(special):");
        p2.setSpecial(0);
        System.out.println(p1.specialAttack(p2));
        System.out.println(p1.getName() + " now has " + p1.getSpecial() + " energy left.");
        System.out.println(p2.specialAttack(p1));
        System.out.println(p2.getName() + " has " + p2.getSpecial() + " energy left.");
        System.out.println(p1.getName() + " now has " + p1.getHP() + " HP.");

        System.out.println("\nRESULT:");
        if (p1.getHP() > p2.getHP()){
            System.out.println(p1.getName() + " IS THE WINNER!");
        }
        else{
            System.out.println(p2.getName() + " IS THE WINNER!");
        }

    }


}
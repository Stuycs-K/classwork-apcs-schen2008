import java.util.Random;
public class Swordsman extends Adventurer{
    private int qi;
    private int maxQi;
    public Swordsman(String name, int hp, int qi, int maxQi) {
        super(name, hp);
        this.qi = qi;
        this.maxQi = maxQi;
    }
    public Swordsman(String name) {
        This(name, 10, 5, 5);
    }
    public String getSpecialName(){
        return "Qi Sword";
    }
    public void setSpecial(int n){
        qi = n;
    }
    public int getSpecialMax(){
        return maxQi;
    }
    public int getSpecial(){
        return qi;
    }
      //hurt or hinder the target adventurer
    public String attack(Adventurer other){
        other.applyDamage(5);
        return getName() + " slashes at " + other.getName() + " for 5 damage!";
    }

    //heall or buff the target adventurer
    public String support(Adventurer other){
        other.setHP(other.getHP() + 3);
        return getName() + " heals " + other.getName() + " for 3 health!";
    }

    //heall or buff self
    public String support(){
        setHP(this.getHP() + 3);
        return getName() + " heals " + getName() + " for 3 health!";
    }

    //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other){
        if(qi-1 >= 0){
            qi--;
            other.applyDamage(8);
            return getName() + " used " + getSpecialName() + " on " + other.getName() + " for 8 damage!";
        }
        else{
            return "No qi! Attack failed!";
        }

    }

}
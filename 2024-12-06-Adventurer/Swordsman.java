import java.util.Random;
public class Samurai implements Adventurer{
    public Swordsman(String name, int hp) {
        super(name, hp);
    }
    public Swordsman(String name) {
        this(name, 15);
    }

}
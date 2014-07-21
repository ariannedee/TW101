/**
 * Created by arianne on 2014-07-21.
 */
public class Orc implements Monster{
    private int hitPoints;

    public Orc() {
        hitPoints = 20;
    }
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public String name() {
        return "Orc";
    }

    @Override
    public int currentHitpoints() {
        return hitPoints;
    }
}

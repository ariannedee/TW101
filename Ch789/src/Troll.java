/**
 * Created by arianne on 2014-07-21.
 */
public class Troll implements Monster {
    private int hitPoints;

    public Troll() {
        hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

    @Override
    public String name() {
        return "Troll";
    }

    @Override
    public int currentHitpoints() {
        return hitPoints;
    }
}

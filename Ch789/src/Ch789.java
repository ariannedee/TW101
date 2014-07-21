import java.util.ArrayList;

/**
 * Created by arianne on 2014-07-21.
 */
public class Ch789 {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Orc());
        monsters.add(new Troll());
        monsters.add(new Orc());
        monsters.add(new Orc());
        monsters.add(new Troll());
        monsters.add(new Orc());
        monsters.add(new Troll());

        for (Monster mon : monsters) {
            mon.takeDamage(10);
        }

        for (Monster mon : monsters) {
            System.out.print(mon.name());
            System.out.print(" ");
            System.out.println(mon.currentHitpoints());
        }
    }
}

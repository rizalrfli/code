package game;
import java.util.*;

public class GameTest {
    public static void main(String[] args) {
        Player p = new Player("Rizal", 120, 25, 5, new LevelScaledStrategy(2));
        p.addSkill(new HealSkill(15));
        p.addSkill(new PiercingStrike(1.2));
        p.addEffect(new Shield(10, 3));
        p.addEffect(new Regen(8, 4));

        BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy(28));
        Monster goblin = new Monster("Goblin", 80, 12, 2, new FixedStrategy(12));

        Battle battle = new Battle(Arrays.asList(p), Arrays.asList(boss, goblin));
        battle.run();
    }
}

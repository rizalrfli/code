package game;

import java.util.Random;
public class Monster extends Enemy {
    private final Random rnd = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive()) return;
        int base = strategy.computeDamage(this, target);
        double factor = 0.8 + rnd.nextDouble() * 0.4;
        int dmg = (int) Math.round(base * factor);
        target.takeDamage(dmg);
        System.out.println(getName() + " -> " + target.getName() + " (Normal hit " + dmg + "): " + target.getName() + " HP -> " + target.getHealth());
    }
}

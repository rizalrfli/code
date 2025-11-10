package game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive()) return;
        turnCounter++;
        int base = strategy.computeDamage(this, target);
        boolean rage = (getHealth() < getMaxHealth() / 2) || (turnCounter % 3 == 0);
        int dmg = rage ? (int) Math.round(base * 2.0) : base;
        target.takeDamage(dmg);
        if (rage) {
            System.out.println(getName() + " -> " + target.getName() + " (RAGE x2: " + dmg + "): " + target.getName() + " HP -> " + target.getHealth());
        } else {
            System.out.println(getName() + " -> " + target.getName() + " (Normal hit " + dmg + "): " + target.getName() + " HP -> " + target.getHealth());
        }
    }
}

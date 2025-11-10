package game;

import java.util.*;
public class Player extends Character {
    private int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();
    private final Random rnd = new Random();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level < 1) throw new IllegalArgumentException("level >= 1");
        Objects.requireNonNull(strategy);
        this.level = level;
        this.strategy = strategy;
    }

    public int getLevel() { return level; }

    public AttackStrategy getStrategy() { return strategy; }

    public void setStrategy(AttackStrategy s) {
        Objects.requireNonNull(s);
        this.strategy = s;
    }

    public void addSkill(Skill s) {
        Objects.requireNonNull(s);
        skills.add(s);
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(skills);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive()) return;
        Skill piercing = null;
        for (Skill s : skills) {
            if (s instanceof PiercingStrike) {
                piercing = s;
                break;
            }
        }

        if (piercing != null && rnd.nextBoolean()) {
            piercing.apply(this, target);
            return;
        }

        int dmg = strategy.computeDamage(this, target);
        target.takeDamage(dmg);
        System.out.println(getName() + " -> " + target.getName() + " (Normal " + dmg + "): " + target.getName() + " HP -> " + target.getHealth());
    }
}

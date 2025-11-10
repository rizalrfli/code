package game;

import java.util.Objects;

public abstract class Enemy extends Character {
    private final int threatLevel;
    protected AttackStrategy strategy;

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        if (threatLevel < 1 || threatLevel > 5) throw new IllegalArgumentException("threatLevel 1..5");
        Objects.requireNonNull(strategy);
        this.threatLevel = threatLevel;
        this.strategy = strategy;
    }

    public final int getThreatLevel() { return threatLevel; }

    public final void setStrategy(AttackStrategy s) {
        Objects.requireNonNull(s);
        this.strategy = s;
    }

    public AttackStrategy getStrategy() { return strategy; }
}

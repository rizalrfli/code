package game;

public class FixedStrategy implements AttackStrategy {
    private final int fixedDamage;
    public FixedStrategy(int fixedDamage) {
        if (fixedDamage < 0) throw new IllegalArgumentException("fixedDamage >= 0");
        this.fixedDamage = fixedDamage;
    }
    @Override
    public int computeDamage(Character self, Character target) {
        return fixedDamage;
    }
    @Override
    public String toString() {
        return "FixedStrategy(" + fixedDamage + ")";
    }
}

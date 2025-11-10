package game;

public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int ap = self.getAttackPower();
        if (self instanceof Player) {
            Player p = (Player) self;
            return ap + bonusPerLevel * p.getLevel();
        } else {
            return ap + bonusPerLevel;
        }
    }

    @Override
    public String toString() {
        return "LevelScaled(+" + bonusPerLevel + "/level)";
    }
}

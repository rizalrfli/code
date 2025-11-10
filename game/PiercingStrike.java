package game;

public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) {
        if (multiplier <= 0) throw new IllegalArgumentException("multiplier > 0");
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike(x" + multiplier + ")";
    }
    @Override
    public void apply(Character self, Character target) {
        int base = self.getAttackPower();
        if (self instanceof Player) {
            Player p = (Player) self;
            base = p.getStrategy().computeDamage(self, target);
        }
        int dmg = (int) Math.round(base * multiplier);
        int shieldReduce = 0;
        for (StatusEffect e : target.getEffects()) {
            if (e instanceof Shield) {
                shieldReduce += ((Shield) e).getFlatReduce();
            }
        }
        int effectiveReduce = (int) Math.round(shieldReduce * 0.75);
        int finalDmg = Math.max(0, dmg - effectiveReduce);

        target.takeDamage(finalDmg);
        System.out.println(self.getName() + " -> " + target.getName() + " (PiercingStrike x" + multiplier + "): " + finalDmg + " dmg");
    }
    @Override
    public String toString() {
        return name();
    }
}

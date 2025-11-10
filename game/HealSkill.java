package game;

public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount > 0");
        this.amount = amount;
    }
    @Override
    public String name() {
        return "HealSkill(+" + amount + ")";
    }
    @Override
    public void apply(Character self, Character target) {
        int healed = Math.min(amount, self.getMaxHealth() - self.getHealth());
        self.setHealth(self.getHealth() + healed);
        System.out.println(self.getName() + " uses HealSkill(+" + amount + "): " + (self.getHealth() - healed) + " -> " + self.getHealth());
    }
    @Override
    public String toString() {
        return name();
    }
}

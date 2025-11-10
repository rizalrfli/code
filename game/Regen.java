package game;

public class Regen implements StatusEffect {
    private final int perTurn;
    private int remainingTurns;

    public Regen(int perTurn, int duration) {
        if (perTurn < 0) throw new IllegalArgumentException("perTurn >= 0");
        if (duration <= 0) throw new IllegalArgumentException("duration > 0");
        this.perTurn = perTurn;
        this.remainingTurns = duration;
    }

    @Override
    public void onTurnStart(Character self) {
    }

    @Override
    public void onTurnEnd(Character self) {
        if (remainingTurns > 0) {
            int healed = Math.min(perTurn, self.getMaxHealth() - self.getHealth());
            self.setHealth(self.getHealth() + healed);
            System.out.println("[End Effects] " + self.getName() + " Regen: +" + healed + " HP => " + self.getHealth());
            remainingTurns--;
        }
    }

    @Override
    public boolean isExpired() {
        return remainingTurns <= 0;
    }

    @Override
    public String toString() {
        return String.format("Regen(+%d HP, %d turns)", perTurn, remainingTurns);
    }
}

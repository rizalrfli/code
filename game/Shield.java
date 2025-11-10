package game;
public class Shield implements StatusEffect {
    private int flatReduce;
    private int remainingTurns;

    public Shield(int flatReduce, int duration) {
        if (flatReduce < 0) throw new IllegalArgumentException("flatReduce >= 0");
        if (duration <= 0) throw new IllegalArgumentException("duration > 0");
        this.flatReduce = flatReduce;
        this.remainingTurns = duration;
    }

    public int getFlatReduce() { return flatReduce; }

    @Override
    public void onTurnStart(Character self) {
        
    }

    @Override
    public void onTurnEnd(Character self) {
        remainingTurns--;
    }

    @Override
    public boolean isExpired() {
        return remainingTurns <= 0;
    }

    @Override
    public String toString() {
        return String.format("Shield(-%d dmg, %d turns)", flatReduce, remainingTurns);
    }
}

package game;
import java.util.*;
public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    private final List<StatusEffect> effects = new ArrayList<>();
    protected Character(String name, int health, int attackPower) {
        Objects.requireNonNull(name, "name non-null");
        if (health < 0) throw new IllegalArgumentException("health must be >= 0");
        if (attackPower < 0) throw new IllegalArgumentException("attackPower must be >= 0");
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }
    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }
    public final int getMaxHealth() { return maxHealth; }
    protected final void setHealth(int value) {
        if (value < 0) value = 0;
        if (value > maxHealth) value = maxHealth;
        this.health = value;
    }
    protected int onIncomingDamage(int base) {
        int dmg = base;
        for (StatusEffect e : effects) {
            if (e instanceof Shield) {
                Shield s = (Shield) e;
                dmg = Math.max(0, dmg - s.getFlatReduce());
            }
        }
        return dmg;
    }
    public final boolean isAlive() { return health > 0; }
    public final void takeDamage(int dmg) {
        int effective = Math.max(0, dmg);
        int afterEffects = onIncomingDamage(effective);
        setHealth(getHealth() - Math.max(0, afterEffects));
    }
    public final void addEffect(StatusEffect e) {
        Objects.requireNonNull(e);
        effects.add(e);
    }
    public final List<StatusEffect> getEffects() {
        return new ArrayList<>(effects);
    }
    public final void performTurn(Character target) {
        if (!isAlive()) {
            System.out.println(getName() + " is dead and cannot act.");
            return;
        }
        Iterator<StatusEffect> itStart = effects.iterator();
        while (itStart.hasNext()) {
            StatusEffect e = itStart.next();
            e.onTurnStart(this);
            if (e.isExpired()) {
            }
        }
        attack(target);
        Iterator<StatusEffect> it = effects.iterator();
        while (it.hasNext()) {
            StatusEffect e = it.next();
            e.onTurnEnd(this);
            if (e.isExpired()) {
                it.remove();
            }
        }
    }
    public abstract void attack(Character target);
    @Override
    public String toString() {
        return String.format("%s(name=%s, HP=%d/%d, AP=%d)", getClass().getSimpleName(), name, health, maxHealth, attackPower);
    }
}
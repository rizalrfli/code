package prakt12;

public class WalkingZombie extends DestroyableEntity{
    private int level;

    public WalkingZombie(String name, int level) {
        super(name, 100.0);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void beDestroyedByPlant() {
        double damagePercent = 2.0;
        double dmg = (damagePercent / 100.0) * health;
        health -= dmg;
        clampHealth();
        System.out.println(name + " (WalkingZombie) attacked by Plant -> -" + damagePercent + "% (" + String.format("%.2f", dmg) + " hp)");
    }

    @Override
    public void heal() {
        double addPercent = 0;
        switch (level) {
            case 1: addPercent = 20.0; break;
            case 2: addPercent = 30.0; break;
            case 3: addPercent = 40.0; break;
            default: addPercent = 20.0; break;
        }
        double added = (addPercent / 100.0) * health;
        health += added;
        System.out.println(name + " (WalkingZombie) healed by " + (int)addPercent + "% -> +" + String.format("%.2f", added) + " hp");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nType      : WalkingZombie\nLevel     : " + level;
    }
}

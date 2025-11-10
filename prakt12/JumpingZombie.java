package prakt12;
public class JumpingZombie extends DestroyableEntity{
    private int level;

    public JumpingZombie(String name, int level) {
        super(name, 100.0);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void beDestroyedByPlant() {
        double damagePercent = 1.0;
        double dmg = (damagePercent / 100.0) * health;
        health -= dmg;
        clampHealth();
        System.out.println(name + " (JumpingZombie) attacked by Plant -> -" + damagePercent + "% (" + String.format("%.2f", dmg) + " hp)");
    }

    @Override
    public void heal() {
        double addPercent = 0;
        switch (level) {
            case 1: addPercent = 30.0; break;
            case 2: addPercent = 40.0; break;
            case 3: addPercent = 50.0; break;
            default: addPercent = 30.0; break;
        }
        double added = (addPercent / 100.0) * health;
        health += added;
        System.out.println(name + " (JumpingZombie) healed by " + (int)addPercent + "% -> +" + String.format("%.2f", added) + " hp");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nType      : JumpingZombie\nLevel     : " + level;
    }
}

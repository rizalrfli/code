package prakt12;
public class Barrier extends DestroyableEntity {
    public Barrier(String name, double initialHealth) {
        super(name, initialHealth);
    }

    @Override
    public void beDestroyedByPlant() {
        double damagePercent = 15.0;
        double dmg = (damagePercent / 100.0) * health;
        health -= dmg;
        clampHealth();
        System.out.println(name + " (Barrier) attacked by Plant -> -" + damagePercent + "% (" + String.format("%.2f", dmg) + " hp)");
    }

    @Override
    public void heal() {
        double addPercent = 10.0;
        double added = (addPercent / 100.0) * health;
        health += added;
        System.out.println(name + " (Barrier) healed by " + (int)addPercent + "% -> +" + String.format("%.2f", added) + " hp");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nType      : Barrier";
    }
}

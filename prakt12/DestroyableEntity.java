package prakt12;
import java.text.DecimalFormat;

public abstract class DestroyableEntity {
    protected String name;
    protected double health;
    protected DecimalFormat df = new DecimalFormat("#.##");

    public DestroyableEntity(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public abstract void beDestroyedByPlant();

    public abstract void heal();

    public String getInfo() {
        return "Name      : " + name + "\n" +
               "Health    : " + df.format(health);
    }

    public double getHealth() {
        return health;
    }
    protected void clampHealth() {
        if (health < 0) health = 0;
    }
}


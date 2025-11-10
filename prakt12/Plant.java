package prakt12;
public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }
    public void attack(DestroyableEntity d) {
        System.out.println("Plant " + name + " attacks -> target: " + d.name);
        d.beDestroyedByPlant();
        System.out.println("After attack, " + d.name + " health = " + String.format("%.2f", d.getHealth()));
    }
}

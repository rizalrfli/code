public class Player extends Character{
    private int level;
    private int healingPower = 10; 
    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }
@Override
    public void attack(Character target) {
    int damage = (int)(super.getHealth() * 0.1) + level; // bonus dari level
    System.out.println(getName() + " attacks with sword! Damage: " + damage);
    target.takeDamage(damage);
}
public void heal() {
        int healAmount = healingPower + (level * 2);
        setHealth(getHealth() + healAmount);
        System.out.println(getName() + " heals for " + healAmount + " HP! Current health: " + getHealth());
    }
    
    public int getLevel() {
        return level;
    }
}

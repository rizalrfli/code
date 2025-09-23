public class BossMonster extends Monster {
    private boolean canUseSpecialAttack;
    
    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
        this.canUseSpecialAttack = true;
    }
    
    @Override
    public void attack(Character target) {
       //50% chance untuk special attack (damage 2x lipat)
        if (canUseSpecialAttack && Math.random() < 0.5) {
            int damage = (getAttackPower() * 2) + (int)(Math.random() * 15);
            System.out.println("BOOMMM!!!! " + getName() + " uses SPECIAL ATTACK! Damage: " + damage);
            target.takeDamage(damage);
        } else {
            int damage = getAttackPower() + (int)(Math.random() * 8);
            System.out.println(getName() + " (" + getType() + ") attacks with devastating force! Damage: " + damage);
            target.takeDamage(damage);
        }
    }
}
public class GameTest {
    public static void main(String[] args) {
        Player p1 = new Player("Rizal", 200, 25, 8);
        BossMonster boss = new BossMonster("Mas Rusdy Ngawi", 100, 20, "Entity Ngawi");
        Monster goblin = new Monster("Ambatukam", 80, 15, "Goblin");
        System.out.println("=== MONSTER BATTLE GAME ===");
        System.out.println("p1: " + p1.getName() + " (Level " + p1.getLevel() + ")");
        System.out.println("Boss Enemy: " + boss.getName() + " (" + boss.getType() + ")");
        System.out.println("Enemy: " + goblin.getName() + " (" + goblin.getType() + ")");
        System.out.println("Battle begins!\n");
        int round = 1;
        while (p1.isAlive() && boss.isAlive()) {
            System.out.println("=== ROUND " + round + " ===");
            System.out.println(p1.getName() + " HP: " + p1.getHealth());
            System.out.println(boss.getName() + " HP: " + boss.getHealth());
            System.out.println();  
            if (p1.isAlive()) {
                if (p1.getHealth() < 40) {
                    System.out.println(p1.getName() + " decides to heal!");
                    p1.heal();
                } else {
                    System.out.println(p1.getName() + " decides to attack!");
                    p1.attack(boss);
                }
                System.out.println();
            }
            if (boss.isAlive()) {
                boss.attack(p1); 
                System.out.println();
            }
            round++;
        }
        System.out.println("=== BATTLE RESULT ===");
        if (p1.isAlive()) {
            System.out.println("LOLL!? " + p1.getName() + " WINS!");
            System.out.println("Final HP: " + p1.getHealth());
        } else {
            System.out.println("HELL NO! " + boss.getName() + " WINS!");
            System.out.println(p1.getName() + " has been defeated...");
        }
        System.out.println("\n=== GOBLIN ATTACK ===");
        Player newp1 = new Player("Testp1", 100, 20, 5);
        Character[] characters = {p1, boss, goblin};
        
        System.out.println("All characters attack Testp1:");
        for (Character c : characters) {
            if (c.isAlive()) {
                c.attack(newp1); 
            }
        }
    }
}
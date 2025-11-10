package prakt12;
public class Tester {
    public static void main(String[] args) {
        Plant peaShooter = new Plant("PeaShooter");

        WalkingZombie wz1 = new WalkingZombie("WZ_Level1", 1);
        WalkingZombie wz2 = new WalkingZombie("WZ_Level3", 3);
        JumpingZombie jz1 = new JumpingZombie("JZ_Level2", 2); 

        Barrier wall = new Barrier("Wall-A", 150.0);
        System.out.println("=== INITIAL STATUS ===");
        System.out.println(wz1.getInfo()); System.out.println();
        System.out.println(wz2.getInfo()); System.out.println();
        System.out.println(jz1.getInfo()); System.out.println();
        System.out.println(wall.getInfo()); System.out.println();
        System.out.println("----------------------------------------");

        peaShooter.attack(wz1);
        System.out.println("----------------------------------------");
        peaShooter.attack(jz1);
        System.out.println("----------------------------------------");
        peaShooter.attack(wall);
        System.out.println("----------------------------------------");

        wz1.heal();
        System.out.println("After heal, " + wz1.name + " health = " + String.format("%.2f", wz1.getHealth()));
        System.out.println("----------------------------------------");

        jz1.heal();
        System.out.println("After heal, " + jz1.name + " health = " + String.format("%.2f", jz1.getHealth()));
        System.out.println("----------------------------------------");
        wall.heal();
        System.out.println("After heal, " + wall.name + " health = " + String.format("%.2f", wall.getHealth()));
        System.out.println("----------------------------------------");
        System.out.println("=== Repeated Attacks ===");
        for (int i = 0; i < 3; i++) {
            peaShooter.attack(wz2);
        }
        System.out.println(wz2.getInfo());
    }
}


package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private int turn = 1;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    public void run() {
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        for (Character c : teamA) {
            System.out.println("  - " + c);
            if (c instanceof Player) {
                Player p = (Player) c;
                System.out.println("    Skills: " + p.getSkills());
                System.out.println("    Effects: " + p.getEffects());
            }
        }
        System.out.println("Team B:");
        for (Character c : teamB) {
            System.out.println("  - " + c);
        }
        System.out.println();

        while (aliveCount(teamA) > 0 && aliveCount(teamB) > 0) {
            System.out.println("=== TURN " + turn + " ===");

            // Team A acts
            for (Character a : new ArrayList<>(teamA)) {
                if (!a.isAlive()) continue;
                Character target = selectTargetForA(a);
                if (target != null) {
                    a.performTurn(target);
                }
            }

            // Team B acts
            for (Character b : new ArrayList<>(teamB)) {
                if (!b.isAlive()) continue;
                Character target = selectTargetForB(b);
                if (target != null) {
                    b.performTurn(target);
                }
            }

            turn++;
            System.out.println();
        }

        // Result
        System.out.println("=== RESULT ===");
        if (aliveCount(teamA) > 0) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Team B menang!");
        }
        System.out.println("Sisa HP:");
        for (Character c : teamA) {
            System.out.println("  - " + c.getName() + ": " + c.getHealth() + "/" + c.getMaxHealth());
        }
        for (Character c : teamB) {
            System.out.println("  - " + c.getName() + ": " + c.getHealth() + "/" + c.getMaxHealth());
        }
    }

    private int aliveCount(List<Character> team) {
        int cnt = 0;
        for (Character c : team) if (c.isAlive()) cnt++;
        return cnt;
    }

    private Character selectTargetForB(Character enemy) {
        // Enemy targets Player with highest HP from teamA
        List<Character> players = teamA.stream().filter(Character::isAlive).collect(Collectors.toList());
        if (players.isEmpty()) return null;
        return players.stream().max(Comparator.comparingInt(Character::getHealth)).orElse(null);
    }

    private Character selectTargetForA(Character actor) {
        List<Character> enemies = teamB.stream().filter(Character::isAlive).collect(Collectors.toList());
        if (enemies.isEmpty()) return null;
        enemies.sort((c1, c2) -> {
            int t1 = (c1 instanceof Enemy) ? ((Enemy) c1).getThreatLevel() : 0;
            int t2 = (c2 instanceof Enemy) ? ((Enemy) c2).getThreatLevel() : 0;
            if (t1 != t2) return Integer.compare(t2, t1); // descending threat
            return Integer.compare(c1.getHealth(), c2.getHealth()); // ascending HP
        });
        return enemies.get(0);
    }
}

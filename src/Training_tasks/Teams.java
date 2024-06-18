package Training_tasks;

public class Teams {
    public static void main(String[] args) {

        Player[] spirit = new Player[5];
        spirit[0] = new Player("Yatoro", 21, 170, "Carry", "Anti-mage");
        spirit[1] = new Player("Larl", 23, 180, "Mid", "Kunka");
        spirit[2] = new Player("Mipposhka", 24, 190, "Support", "Enchanters");
        spirit[3] = new Player("Collaps", 20, 170, "Hard-line", "Magnus");
        spirit[4] = new Player("Mira", 27, 190, "4Support", "Pugna");

        for (Player player : spirit) {
            String infoPlayer = player.name + " - " + player.year + " - " + player.height  + " - " + player.position + " - " + player.favoriteHero;
            System.out.println(infoPlayer);
        }
        }


    }


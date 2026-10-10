import java.util.Arrays;

/**
 * Week 5 - Problem 5: Fantasy League Auto-Draft Ranking Engine
 * Method overloading, Comparable, Arrays.sort, encapsulation
 */
class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage; // used as fantasy points for ranking
    boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Rank by fantasy points (battingAverage) descending
    @Override
    public int compareTo(Player other) {
        // Higher battingAverage comes first → reverse natural order
        return Double.compare(other.battingAverage, this.battingAverage);
    }
}

public class P5_FantasyAutoDraft {

    // Overloaded rule 1: established players (matches >= 10) qualify on experience alone
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded rule 2: newer players need matches >= 5 AND not injured
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players) {
        // Collect draftable players
        Player[] draftable = new Player[players.length];
        int count = 0;

        for (Player p : players) {
            boolean qualifies;
            if (p.matchesPlayed >= 10) {
                // Use experience-only rule
                qualifies = isDraftable(p.matchesPlayed);
            } else {
                // Use combined matches + fitness rule
                qualifies = isDraftable(p.matchesPlayed, p.injured);
            }

            if (qualifies) {
                draftable[count++] = p;
            }
        }

        // Trim to actual size
        Player[] finalList = Arrays.copyOf(draftable, count);

        // Sort by fantasy points descending (compareTo handles it)
        Arrays.sort(finalList);

        // Build ranked output string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < finalList.length; i++) {
            sb.append(i + 1).append(". ").append(finalList[i].name);
            if (i < finalList.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
        // Expected: 1. Rahul | 2. Virat | 3. Dev
    }
}

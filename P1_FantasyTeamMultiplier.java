import java.util.Arrays;

/**
 * Week 5 - Problem 1: Fantasy Team Score Multiplier
 * Arrays passed by reference — modify original array in place
 */
public class P1_FantasyTeamMultiplier {

    // Modifies the caller's original array directly — returns nothing
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] = playerScores[captainIndex] * 2.0;       // Captain 2x
        playerScores[viceCaptainIndex] = playerScores[viceCaptainIndex] * 1.5; // Vice-Captain 1.5x
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores)); // [40.0, 110.0, 30.0, 93.0]
    }
}

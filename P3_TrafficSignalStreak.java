/**
 * Week 1 - Problem 3: The Traffic Signal Streak Analyzer
 * Concepts: String traversal, character comparison, tracking running maximum
 */
public class P3_TrafficSignalStreak {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Empty signal log");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int longestLength = 1;

        char currentColor = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentLength++;
            } else {
                // streak ended — check if it was the longest
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestColor = currentColor;
                }
                // start new streak
                currentColor = signalLog.charAt(i);
                currentLength = 1;
            }
        }

        // check the final streak
        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestColor = currentColor;
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longestLength + " times");
    }

    public static void main(String[] args) {
        // Sample 1
        findLongestStreak("RRGGGYRR");

        // Sample 2
        findLongestStreak("RRRRYYGG");
    }
}

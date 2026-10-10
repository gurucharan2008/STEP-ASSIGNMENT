/**
 * Week 1 - Problem 5: The Movie Review Word Length Profiler
 * Concepts: String splitting (split()), loops, conditional logic, counting
 */
public class P5_MovieReviewWordProfiler {

    public static void classifyWordLengths(String review) {
        // Split on one or more whitespace characters
        String[] words = review.trim().split("\\s+");

        int shortCount = 0;   // 1–4 letters
        int mediumCount = 0;  // 5–8 letters
        int longCount = 0;    // 9+ letters

        for (String word : words) {
            int len = word.length();
            if (len >= 1 && len <= 4) {
                shortCount++;
            } else if (len >= 5 && len <= 8) {
                mediumCount++;
            } else if (len >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        // Sample
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}

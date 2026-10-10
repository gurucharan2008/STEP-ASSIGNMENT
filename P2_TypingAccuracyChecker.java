/**
 * Week 1 - Problem 2: The Typing Speed Test Accuracy Checker
 * Concepts: String traversal, charAt(), loops, percentage calculation
 */
public class P2_TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int totalChars = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char originalChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < totalChars; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position
                originalChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = (matched * 100.0) / totalChars;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, totalChars, accuracy);

        if (firstMismatchPos == -1) {
            System.out.println(" | No Mismatches");
        } else {
            System.out.println(" | First Mismatch at position " + firstMismatchPos
                    + " ('" + originalChar + "' vs '" + typedChar + "')");
        }
    }

    public static void main(String[] args) {
        // Sample 1
        checkTypingAccuracy("hello world", "hello worlt");

        // Sample 2
        checkTypingAccuracy("coding", "coding");
    }
}

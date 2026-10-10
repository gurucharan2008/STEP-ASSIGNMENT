import java.util.*;

/**
 * Week 2 - Problem 5: Stop-Word-Filtered Word Frequency Report
 * Concepts: replace(), split(), HashMap, sorting by frequency
 */
public class P5_StopWordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        // Fixed stop-word list
        Set<String> stopWords = new HashSet<>(Arrays.asList(
                "the", "was", "and", "a", "is", "of", "in"
        ));

        // Normalize: lowercase + strip punctuation (periods and commas)
        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        // Split on whitespace
        String[] words = cleaned.trim().split("\\s+");

        // Count frequency of non-stop words
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            if (stopWords.contains(word)) continue;

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        // Sort by count descending (ties in any order is fine)
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print results
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Sample
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}

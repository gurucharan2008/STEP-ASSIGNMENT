public class SecondBestScore {

    /**
     * Returns the second-highest distinct score, or -1 if it does not exist.
     * Does not sort the array.
     *
     * Time complexity: O(n) — single pass
     * Space complexity: O(1)
     *
     * Sorting the array first would be O(n log n) time, which is slower.
     */
    public static int secondHighest(int[] scores) {
        if (scores == null || scores.length == 0) {
            return -1;
        }

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score > second && score < highest) {
                second = score;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] sample1 = {45, 78, 92, 78, 60};
        System.out.println("Sample 1: " + secondHighest(sample1)); // 78

        int[] sample2 = {50, 50, 50};
        System.out.println("Sample 2: " + secondHighest(sample2)); // -1
    }
}

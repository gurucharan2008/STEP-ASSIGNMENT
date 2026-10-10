public class ExamScoreBandCounter {

    /**
     * Returns the number of scores in the sorted array that lie in the inclusive band [low, high].
     * Uses two binary searches for O(log n) time.
     *
     * Time complexity of linear scan: O(n)
     * Time complexity of this solution: O(log n)
     * Space complexity: O(1)
     *
     * Duplicates: We find the leftmost index where score >= low and the leftmost index
     * where score > high. The difference gives the exact count even when duplicates
     * exist at the boundaries.
     */
    public static int countInBand(int[] scores, int low, int high) {
        if (scores == null || scores.length == 0 || low > high) {
            return 0;
        }

        int left = lowerBound(scores, low);          // first index with score >= low
        int right = lowerBound(scores, high + 1);    // first index with score > high

        return right - left;
    }

    /**
     * Returns the first index where scores[i] >= target.
     * If all elements are < target, returns scores.length.
     */
    private static int lowerBound(int[] scores, int target) {
        int left = 0;
        int right = scores.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};

        System.out.println("Sample 1: " + countInBand(scores, 42, 58)); // 6
        System.out.println("Sample 2: " + countInBand(scores, 90, 100)); // 0
    }
}

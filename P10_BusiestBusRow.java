/**
 * Week 10.1 - Problem 10: Busiest Bus Row
 *
 * Time Complexity:  O(r * c)  — visit every seat once
 * Extra Space:      O(1)      — only a few variables (no extra array)
 */
public class P10_BusiestBusRow {

    /**
     * Returns the index of the row with the largest total and that total.
     * On a tie, returns the smaller index.
     */
    public static String busiestRow(int[][] grid) {
        int bestRow = 0;
        int bestTotal = 0;

        // First row total (initialize)
        for (int seat : grid[0]) {
            bestTotal += seat;
        }

        // Check remaining rows — update only when STRICTLY larger
        for (int i = 1; i < grid.length; i++) {
            int rowTotal = 0;
            for (int seat : grid[i]) {
                rowTotal += seat;
            }
            if (rowTotal > bestTotal) {   // strictly larger → update
                bestTotal = rowTotal;
                bestRow = i;
            }
        }

        return "Row " + bestRow + ", Total " + bestTotal;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        System.out.println(busiestRow(grid));
        // Expected: Row 1, Total 7
    }
}

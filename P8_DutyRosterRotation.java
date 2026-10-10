import java.util.Arrays;

/**
 * Week 10.3 - Problem 8: Duty Roster Rotation
 *
 * Time Complexity:  O(n)  — one pass to place each name
 * Extra Space:      O(n)  — new array for the rotated result
 *
 * Why not rotate one place at a time, k times?
 *   That would be O(n * k). When k is up to 10^9 this becomes extremely slow.
 *   Using k % n reduces k to the range [0, n-1], so we only need one O(n) pass.
 */
public class P8_DutyRosterRotation {

    public static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        if (n == 0) return names;

        // Remove full turns — k may be huge (up to 10^9)
        k = k % n;
        if (k == 0) return Arrays.copyOf(names, n);

        String[] rotated = new String[n];

        // Each name at index i moves to index (i + k) % n
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        // Sample 1
        String[] names1 = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names1, 2)));
        // Expected: [D, E, A, B, C]

        // Sample 2 (k > n)
        String[] names2 = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names2, 7)));
        // Expected: [D, E, A, B, C]  // 7 % 5 = 2
    }
}

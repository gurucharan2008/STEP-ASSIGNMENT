/**
 * Week 10.2 - Problem 6: Class Attendance Tracker
 *
 * Time Complexity:  O(n)  — single pass over the array
 * Extra Space:      O(1)  — only a few counters
 * Yes, both answers (present count + longest streak) are found in one pass.
 */
public class P6_ClassAttendanceTracker {

    public static String attendanceSummary(int[] days) {
        int presentCount = 0;
        int currentStreak = 0;
        int longestStreak = 0;

        for (int day : days) {
            if (day == 1) {
                presentCount++;
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0; // reset on absent
            }
        }

        return "Present: " + presentCount + ", Longest streak: " + longestStreak;
    }

    public static void main(String[] args) {
        // Sample 1
        int[] days1 = {1, 1, 0, 1, 1, 1, 0, 1};
        System.out.println(attendanceSummary(days1));
        // Expected: Present: 6, Longest streak: 3

        // Sample 2
        int[] days2 = {0, 0, 0};
        System.out.println(attendanceSummary(days2));
        // Expected: Present: 0, Longest streak: 0
    }
}

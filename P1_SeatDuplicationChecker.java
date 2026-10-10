/**
 * Week 1 - Problem 1: The Exam Hall Seat Duplication Checker
 * Concepts: Arrays, nested loops, conditional logic
 */
public class P1_SeatDuplicationChecker {

    // Check for duplicate seat numbers using only arrays and loops
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    break; // avoid printing same duplicate multiple times from this i
                }
            }
            if (foundDuplicate) {
                // continue to find other unique duplicates if needed,
                // but sample shows one; we break outer for clean single message style
                break;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        // Sample 1
        int[] seats1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(seats1);

        // Sample 2
        int[] seats2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(seats2);
    }
}

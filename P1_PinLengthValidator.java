/**
 * Week 2 - Problem 1: ATM PIN Length Validator
 * Concepts: length(), if/else
 */
public class P1_PinLengthValidator {

    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        // Sample 1
        checkPinLength("482");

        // Sample 2
        checkPinLength("4820");
    }
}

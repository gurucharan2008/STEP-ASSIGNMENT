/**
 * Week 7 - Problem 3: The Password Checker
 * Password stored privately — never exposed, only strength rating returned
 */
class PasswordChecker {
    private final String password; // final so it can't be changed after creation

    public PasswordChecker(String password) {
        this.password = password;
    }

    // No getter for the password itself!

    public String getStrength() {
        int len = password.length();
        if (len < 6) {
            return "Weak";
        } else if (len <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class P3_PasswordChecker {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength()); // Weak

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println(pc2.getStrength()); // Strong

        PasswordChecker pc3 = new PasswordChecker("pass1234");
        System.out.println(pc3.getStrength()); // Medium
    }
}

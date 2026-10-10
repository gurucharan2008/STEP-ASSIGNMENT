/**
 * M2. Payroll Salary Management
 * Encapsulation, Data Validation
 */
class PayrollAccount {
    private double basicSalary;
    private double bonus;

    // Public constructor - rejects negative basic salary
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Negative basic salary not allowed. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    // Rejects amount <= 0
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount. Must be greater than 0.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Reduces basicSalary by percentage, rejects percent outside 0-100
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percent. Must be between 0 and 100.");
        } else {
            this.basicSalary = this.basicSalary * (1 - percent / 100.0);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    // Read-only access to net salary
    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class M2_PayrollAccount {
    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}

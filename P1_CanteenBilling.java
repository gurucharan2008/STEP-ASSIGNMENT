import java.util.Scanner;

/**
 * Week 8 - Problem 1: The Canteen Billing Counter
 * Polymorphism — different customer types, same calculateFinalAmount()
 */
abstract class Customer {
    protected double billAmount;

    Customer(double billAmount) {
        this.billAmount = billAmount;
    }

    abstract double calculateFinalAmount();
    abstract String getType();
}

class Student extends Customer {
    Student(double billAmount) { super(billAmount); }

    @Override
    double calculateFinalAmount() {
        return billAmount * 0.90; // 10% discount
    }

    @Override
    String getType() { return "STUDENT"; }
}

class Staff extends Customer {
    Staff(double billAmount) { super(billAmount); }

    @Override
    double calculateFinalAmount() {
        return billAmount * 0.95; // 5% discount
    }

    @Override
    String getType() { return "STAFF"; }
}

class Guest extends Customer {
    Guest(double billAmount) { super(billAmount); }

    @Override
    double calculateFinalAmount() {
        return billAmount + 10; // full + ₹10 service charge
    }

    @Override
    String getType() { return "GUEST"; }
}

public class P1_CanteenBilling {
    public static void main(String[] args) {
        // Sample data (hard-coded to match sample)
        Customer[] bills = {
            new Student(200),
            new Staff(300),
            new Guest(150)
        };

        double grandTotal = 0;
        for (Customer c : bills) {
            double finalAmt = c.calculateFinalAmount();
            System.out.printf("%s: %.2f%n", c.getType(), finalAmt);
            grandTotal += finalAmt;
        }
        System.out.printf("Total: %.2f%n", grandTotal);
    }
}

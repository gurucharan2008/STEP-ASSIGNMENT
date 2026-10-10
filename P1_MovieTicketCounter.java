/**
 * Week 9 - Problem 1: Movie Ticket Counter
 * Abstract class holds shared convenience fee; subclasses set seat price
 */
abstract class Ticket {
    protected int count;
    protected static final double CONVENIENCE_FEE = 20.0; // written in one place only

    Ticket(int count) {
        this.count = count;
    }

    abstract double getSeatPrice();
    abstract String getSeatType();

    // Shared calculation — fee never duplicated
    double calculateAmount() {
        return count * (getSeatPrice() + CONVENIENCE_FEE);
    }
}

class RegularTicket extends Ticket {
    RegularTicket(int count) { super(count); }
    @Override double getSeatPrice() { return 150; }
    @Override String getSeatType() { return "REGULAR"; }
}

class PremiumTicket extends Ticket {
    PremiumTicket(int count) { super(count); }
    @Override double getSeatPrice() { return 250; }
    @Override String getSeatType() { return "PREMIUM"; }
}

class ReclinerTicket extends Ticket {
    ReclinerTicket(int count) { super(count); }
    @Override double getSeatPrice() { return 400; }
    @Override String getSeatType() { return "RECLINER"; }
}

public class P1_MovieTicketCounter {
    public static void main(String[] args) {
        Ticket[] bookings = {
            new RegularTicket(3),
            new PremiumTicket(2),
            new ReclinerTicket(1)
        };

        double total = 0;
        for (Ticket t : bookings) {
            double amount = t.calculateAmount();
            System.out.printf("%s: %.2f%n", t.getSeatType(), amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

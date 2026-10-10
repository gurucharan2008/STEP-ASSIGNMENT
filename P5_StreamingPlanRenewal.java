import java.time.LocalDate;

/**
 * Week 8 - Problem 5: The Streaming Plan Renewal Reminder
 * Polymorphism — different plans, same getRenewalDate()
 */
abstract class SubscriptionPlan {
    protected String name;
    protected LocalDate startDate;

    SubscriptionPlan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract LocalDate getRenewalDate();

    String getName() { return name; }
}

class BasicPlan extends SubscriptionPlan {
    BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    LocalDate getRenewalDate() {
        return startDate.plusDays(30);
    }
}

class StandardPlan extends SubscriptionPlan {
    StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    LocalDate getRenewalDate() {
        return startDate.plusDays(90);
    }
}

class PremiumPlan extends SubscriptionPlan {
    PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    @Override
    LocalDate getRenewalDate() {
        return startDate.plusDays(365);
    }
}

public class P5_StreamingPlanRenewal {
    public static void main(String[] args) {
        // Sample data
        SubscriptionPlan[] subscribers = {
            new BasicPlan("Asha", LocalDate.of(2024, 1, 15)),
            new StandardPlan("Ravi", LocalDate.of(2024, 2, 1)),
            new PremiumPlan("Neha", LocalDate.of(2024, 3, 10)),
            new BasicPlan("Kiran", LocalDate.of(2024, 12, 20))
        };

        for (SubscriptionPlan plan : subscribers) {
            System.out.println(plan.getName() + ": " + plan.getRenewalDate());
        }
        // Expected:
        // Asha: 2024-02-14
        // Ravi: 2024-05-01
        // Neha: 2025-03-10
        // Kiran: 2025-01-19
    }
}

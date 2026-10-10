/**
 * Week 8 - Problem 4: The Festival Bonus Calculator
 * Polymorphism — different employee types, same calculateBonus()
 */
abstract class Employee {
    protected String name;
    protected double monthlySalary;

    Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    abstract double calculateBonus();

    String getName() { return name; }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    double calculateBonus() {
        return monthlySalary * 0.10; // 10%
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    double calculateBonus() {
        return monthlySalary * 0.05; // 5%
    }
}

class Intern extends Employee {
    Intern(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    double calculateBonus() {
        return 2000.0; // fixed ₹2000
    }
}

public class P4_FestivalBonus {
    public static void main(String[] args) {
        // Sample data
        Employee[] employees = {
            new FullTimeEmployee("Asha", 50000),
            new PartTimeEmployee("Ravi", 30000),
            new Intern("Neha", 15000)
        };

        double grandTotal = 0;
        for (Employee e : employees) {
            double bonus = e.calculateBonus();
            System.out.printf("%s: %.2f%n", e.getName(), bonus);
            grandTotal += bonus;
        }
        System.out.printf("Total Bonus: %.2f%n", grandTotal);
    }
}

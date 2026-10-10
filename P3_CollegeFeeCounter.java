/**
 * Week 9 - Problem 3: College Fee Counter
 * Abstract Student + BusUser interface for those who use the bus
 */
interface BusUser {
    double getTransportFee();
}

abstract class Student {
    protected String name;

    Student(String name) {
        this.name = name;
    }

    abstract double getTuition();

    // Default: no bus
    double getTransportFee() {
        return 0.0;
    }

    double getTotalFee() {
        return getTuition() + getTransportFee();
    }

    String getName() { return name; }
}

class DayScholar extends Student implements BusUser {
    DayScholar(String name) { super(name); }

    @Override
    double getTuition() { return 40000; }

    @Override
    public double getTransportFee() { return 12000; }

    @Override
    double getTransportFee() { return 12000; } // shadow for total calculation
}

class Hosteller extends Student {
    Hosteller(String name) { super(name); }

    @Override
    double getTuition() {
        return 40000 + 60000; // tuition + hostel
    }
}

class Scholar extends Student implements BusUser {
    Scholar(String name) { super(name); }

    @Override
    double getTuition() { return 20000; } // half tuition

    @Override
    public double getTransportFee() { return 12000; }

    @Override
    double getTransportFee() { return 12000; }
}

public class P3_CollegeFeeCounter {
    public static void main(String[] args) {
        Student[] students = {
            new DayScholar("Asha"),
            new Hosteller("Ravi"),
            new Scholar("Neha")
        };

        double totalCollected = 0;
        for (Student s : students) {
            double fee = s.getTotalFee();
            System.out.printf("%s: %.2f%n", s.getName(), fee);
            totalCollected += fee;
        }
        System.out.printf("Total Collected: %.2f%n", totalCollected);
    }
}

/**
 * Week 8 - Problem 3: The Hostel Electricity Bill
 * Polymorphism — different room types, same calculateBill()
 */
abstract class Room {
    protected int units;

    Room(int units) {
        this.units = units;
    }

    abstract double calculateBill();
    abstract String getType();
}

class SingleRoom extends Room {
    SingleRoom(int units) { super(units); }

    @Override
    double calculateBill() {
        return units * 8.0; // ₹8 per unit
    }

    @Override
    String getType() { return "SINGLE"; }
}

class SharedRoom extends Room {
    private int occupants;

    SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    @Override
    double calculateBill() {
        // ₹6 per unit, split equally among occupants
        return (units * 6.0) / occupants;
    }

    @Override
    String getType() { return "SHARED"; }
}

class ACRoom extends Room {
    ACRoom(int units) { super(units); }

    @Override
    double calculateBill() {
        return units * 10.0 + 200; // ₹10 per unit + ₹200 fixed
    }

    @Override
    String getType() { return "AC"; }
}

public class P3_HostelElectricity {
    public static void main(String[] args) {
        // Sample data
        Room[] rooms = {
            new SingleRoom(120),
            new SharedRoom(150, 3),
            new ACRoom(100)
        };

        double grandTotal = 0;
        for (Room r : rooms) {
            double bill = r.calculateBill();
            System.out.printf("%s: %.2f%n", r.getType(), bill);
            grandTotal += bill;
        }
        System.out.printf("Total: %.2f%n", grandTotal);
    }
}

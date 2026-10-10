/**
 * Week 8 - Problem 2: The Campus Parking Charge Calculator
 * Polymorphism — different vehicle types, same calculateCharge()
 */
abstract class Vehicle {
    protected int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double calculateCharge();
    abstract String getType();
}

class Bike extends Vehicle {
    Bike(int hours) { super(hours); }

    @Override
    double calculateCharge() {
        return hours * 10.0; // ₹10 per hour
    }

    @Override
    String getType() { return "BIKE"; }
}

class Car extends Vehicle {
    Car(int hours) { super(hours); }

    @Override
    double calculateCharge() {
        if (hours <= 1) return 30.0;
        return 30.0 + (hours - 1) * 20.0; // ₹30 first hour + ₹20 each additional
    }

    @Override
    String getType() { return "CAR"; }
}

class Truck extends Vehicle {
    Truck(int hours) { super(hours); }

    @Override
    double calculateCharge() {
        double charge = hours * 50.0;
        return Math.max(charge, 100.0); // min ₹100
    }

    @Override
    String getType() { return "TRUCK"; }
}

public class P2_ParkingCharge {
    public static void main(String[] args) {
        // Sample data
        Vehicle[] vehicles = {
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        };

        double grandTotal = 0;
        for (Vehicle v : vehicles) {
            double charge = v.calculateCharge();
            System.out.printf("%s: %.2f%n", v.getType(), charge);
            grandTotal += charge;
        }
        System.out.printf("Total: %.2f%n", grandTotal);
    }
}

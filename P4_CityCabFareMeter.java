/**
 * Week 9 - Problem 4: City Cab Fare Meter
 * Abstract Cab + NightService interface (only Sedan & SUV)
 */
interface NightService {
    // marker + ability
}

abstract class Cab {
    protected double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRatePerKm();
    abstract String getType();

    // Shared minimum fare rule
    double calculateBaseFare() {
        double fare = km * getRatePerKm();
        return Math.max(fare, 100.0);
    }

    // Default: no night service
    boolean supportsNightService() {
        return false;
    }

    double calculateFare(boolean isNight) {
        if (isNight && !supportsNightService()) {
            return -1; // signal rejection
        }
        double fare = calculateBaseFare();
        if (isNight) {
            fare = fare * 1.20; // +20%
        }
        return fare;
    }
}

class Mini extends Cab {
    Mini(double km) { super(km); }
    @Override double getRatePerKm() { return 10; }
    @Override String getType() { return "MINI"; }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) { super(km); }
    @Override double getRatePerKm() { return 14; }
    @Override String getType() { return "SEDAN"; }
    @Override boolean supportsNightService() { return true; }
}

class SUV extends Cab implements NightService {
    SUV(double km) { super(km); }
    @Override double getRatePerKm() { return 18; }
    @Override String getType() { return "SUV"; }
    @Override boolean supportsNightService() { return true; }
}

public class P4_CityCabFareMeter {
    public static void main(String[] args) {
        // Sample trips: cab, km, isNight
        Object[][] trips = {
            {new Mini(8), false},
            {new Sedan(10), true},
            {new SUV(20), false},
            {new Mini(5), true}
        };

        double total = 0;
        for (Object[] trip : trips) {
            Cab cab = (Cab) trip[0];
            boolean isNight = (Boolean) trip[1];
            double fare = cab.calculateFare(isNight);

            if (fare < 0) {
                System.out.println(cab.getType() + ": night service not available");
            } else {
                System.out.printf("%s: %.2f%n", cab.getType(), fare);
                total += fare;
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

/**
 * Week 9 - Problem 5: Home Appliance Energy Report
 * Abstract Appliance + SaverMode interface (only AC & Washer)
 */
interface SaverMode {
    // marker interface — appliances that support saver mode implement this
}

abstract class Appliance {
    protected double hours;
    protected boolean saverRequested;

    Appliance(double hours, boolean saverRequested) {
        this.hours = hours;
        this.saverRequested = saverRequested;
    }

    abstract double getPowerWatts();
    abstract String getName();

    boolean supportsSaverMode() {
        return this instanceof SaverMode;
    }

    double calculateUnits() {
        double units = getPowerWatts() * hours / 1000.0;
        if (saverRequested && supportsSaverMode()) {
            units = units * 0.75; // 25% reduction
        }
        return units;
    }

    double calculateCost() {
        return calculateUnits() * 8.0;
    }
}

class Fridge extends Appliance {
    Fridge(double hours, boolean saverRequested) { super(hours, saverRequested); }
    @Override double getPowerWatts() { return 150; }
    @Override String getName() { return "FRIDGE"; }
}

class AC extends Appliance implements SaverMode {
    AC(double hours, boolean saverRequested) { super(hours, saverRequested); }
    @Override double getPowerWatts() { return 1500; }
    @Override String getName() { return "AC"; }
}

class TV extends Appliance {
    TV(double hours, boolean saverRequested) { super(hours, saverRequested); }
    @Override double getPowerWatts() { return 100; }
    @Override String getName() { return "TV"; }
}

class Washer extends Appliance implements SaverMode {
    Washer(double hours, boolean saverRequested) { super(hours, saverRequested); }
    @Override double getPowerWatts() { return 500; }
    @Override String getName() { return "WASHER"; }
}

public class P5_HomeApplianceEnergy {
    public static void main(String[] args) {
        Appliance[] appliances = {
            new Fridge(24, false),
            new AC(8, true),
            new TV(5, false),
            new Washer(2, true)
        };

        double totalCost = 0;
        for (Appliance a : appliances) {
            if (a.saverRequested && !a.supportsSaverMode()) {
                System.out.println(a.getName() + ": saver mode not supported");
            } else {
                double units = a.calculateUnits();
                double cost = a.calculateCost();
                System.out.printf("%s: Units=%.2f Cost=%.2f%n", a.getName(), units, cost);
                totalCost += cost;
            }
        }
        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}

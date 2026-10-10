/**
 * Week 9 - Problem 2: Parcel Shipping Desk
 * Abstract Parcel + Insurable interface (only Express & Fragile implement it)
 */
interface Insurable {
    double getInsurance(double declaredValue);
}

abstract class Parcel {
    protected double weightKg;
    protected double declaredValue;

    Parcel(double weightKg, double declaredValue) {
        this.weightKg = weightKg;
        this.declaredValue = declaredValue;
    }

    abstract double getShippingCharge();
    abstract String getType();

    // Default: no insurance
    double getInsurance() {
        return 0.0;
    }

    double getTotal() {
        return getShippingCharge() + getInsurance();
    }
}

class StandardParcel extends Parcel {
    StandardParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    double getShippingCharge() {
        return 40 + 10 * weightKg;
    }

    @Override
    String getType() { return "STANDARD"; }
}

class ExpressParcel extends Parcel implements Insurable {
    ExpressParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    double getShippingCharge() {
        return 80 + 15 * weightKg;
    }

    @Override
    public double getInsurance(double declaredValue) {
        return declaredValue * 0.02;
    }

    @Override
    double getInsurance() {
        return getInsurance(declaredValue);
    }

    @Override
    String getType() { return "EXPRESS"; }
}

class FragileParcel extends Parcel implements Insurable {
    FragileParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    @Override
    double getShippingCharge() {
        // standard charge + handling fee 50
        return (40 + 10 * weightKg) + 50;
    }

    @Override
    public double getInsurance(double declaredValue) {
        return declaredValue * 0.02;
    }

    @Override
    double getInsurance() {
        return getInsurance(declaredValue);
    }

    @Override
    String getType() { return "FRAGILE"; }
}

public class P2_ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = {
            new StandardParcel(3, 500),
            new ExpressParcel(2, 1000),
            new FragileParcel(4, 2000)
        };

        double grandTotal = 0;
        for (Parcel p : parcels) {
            double charge = p.getShippingCharge();
            double insurance = p.getInsurance();
            double total = p.getTotal();
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    p.getType(), charge, insurance, total);
            grandTotal += total;
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}

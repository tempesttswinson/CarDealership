
public class Car extends Vehicle implements Leaseable, Discountable {
    // Simple Car constructor inheriting all the methods of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification new1) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, new1);
    }

    @Override
    public double getTargetMargin() {
        // use the getTargetMargin method as its defined in our superclass (Vehicle)
        return super.getTargetMargin() - 1000;
    }

    // Implementing methods from ILeaseable
    @Override
    public boolean isLeaseable() {
        return true;
    }

    @Override
    public int getLeaseTerm() {
        return 24;
    }

    @Override
    public int getMaxMilesPerYear() {
        return 15_000;
    }

    // Implementing methods from IDiscountable
    @Override
    public float getMaximumDiscountPct() {
        return 18.5f;
    }

    @Override
    public float getPersonDiscount() {
        return 12.5f;
    }

    @Override
    public float getCorporateDiscount() {
        return 20.0f;
    }
}
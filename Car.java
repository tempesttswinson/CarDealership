package CarDealership;

public class Car extends Vehicle {
    // Simple Car constructor inheriting all the methods of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        // use the getTargetMargin method as its defined in our superclass (Vehicle)
        return super.getTargetMargin() - 1000;
    }
}
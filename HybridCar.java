
public class HybridCar extends Car {
    // properties
    private int batteryLife, MPG;
    private String chargerType;

    // consturctor
    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass, int batteryLife, int MPG, String chargerType) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }

    // getters & setters
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getMPG() {
        return MPG;
    }

    public void setMPG(int mPG) {
        MPG = mPG;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }
}

public class LightTruck extends Vehicle {
    // properties
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean is4wd;

    // constructors
    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass, long towingCapacity, long grossCombinedWeight,
            long truckWeight, boolean is4wd) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;

        if (this.is4wd == true) {
            this.xferCase = new TransferCase();
        }
    }

    // getters + setters
    public long getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public long getGrossCombinedWeight() {
        return grossCombinedWeight;
    }

    // Method to Overload manually Set GCW
    public void setGrossCombinedWeight(long grossCombinedWeight) {
        this.grossCombinedWeight = grossCombinedWeight;
    }

    // Method to automatically calculate GCW if no params given
    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    public long getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(long truckWeight) {
        this.truckWeight = truckWeight;
    }

    public boolean isIs4wd() {
        return is4wd;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    @Override
    public String toString() {
        // get the string output from our "default" superclass method
        // Example: 2018 Kia Sorrento and stores it in a variable str
        String str = super.toString();
        // if 4WD, add it to the return string
        if (is4wd) {
            str += ", (4 WD)";// appends string to the end of our str variable
        }
        return str;

    }

    public class TransferCase {
        private int numGears;

        public TransferCase() {
            this.numGears = 4;
        }

        public TransferCase(int gears) {
            this.numGears = gears;
        }

        public int getNumGears() {
            return this.numGears;
        }
    }

    public TransferCase xferCase;
}
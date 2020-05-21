import java.time.LocalDateTime;

public class SalesDepartment extends Department {

    public SalesDepartment() {
        super("Sales", 50);
    }

    // create " associatioin between Vehicle and Service Department
    // very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v) {
        // because service department doesnt "own" the lifetime of the object its good
        // practice to ensure a valid object has been passed in
        if (v != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // Sales is open 7 days a week
        return true;
    }
}
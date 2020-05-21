import java.time.LocalDateTime;

public class SalesDepartment {

    public SalesDepartment() {
        super("Sales", 50);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // Sales is open 7 days a week
        return true;
    }
}
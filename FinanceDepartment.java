import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FinanceDepartment extends Department {

    public FinanceDepartment() {
        super("Finance", 10);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // SUNDAY is an example of an enumeration
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY) || day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return false;
        } else {
            return true;
        }
    }
}
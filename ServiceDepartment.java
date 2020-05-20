import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {

    // constuctor with deptName and numEmployees given
    public ServiceDepartment() {
        super("Service", 20);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // SUNDAY is an example of an enumeration
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }
}
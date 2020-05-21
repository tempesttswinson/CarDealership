import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String name, int numEmployees) {
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    public static void printIsOpen(List<Department> depts, LocalDateTime today) {
        // Cycle through each department in provided list
        for (Department d : depts) {
            // Print out name of dept and return if that dept is open today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday(today));
        }
        // Use instance of keyword to test if item in List is of a certain object or
        // data
        if (d instanceof ServiceDepartment) {
            System.out.println(d.toString() + " only closes on Sunday");
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department ";
    }

}
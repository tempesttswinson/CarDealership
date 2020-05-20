import java.time.LocalDateTime;

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

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department ";
    }

}
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Dealership {

    public static void main(String[] args) {

        // instanciate new object for each department
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDepartment fd = new FinanceDepartment();
        SalesDepartment sales = new SalesDepartment();

        // add our departments to a list
        List<Department> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());
    }
}
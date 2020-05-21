import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Dealership {

    public static void main(String[] args) {

        // // instanciate new object for each department
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        // // add our departments to a list
        // List<Department> depts = new ArrayList<>();
        // depts.add(sd);
        // depts.add(fd);
        // depts.add(sales);

        // Department.printIsOpen(depts, LocalDateTime.now());

        Leaseable lease = new Car("52430899FD", 33000.00, 42000.00, 2019, "Chevrolet", "Impala", "White",
                VehicleClassification.NEW);

        System.out.println("Number of months to lease: " + lease.getLeaseTerm());
    }
}
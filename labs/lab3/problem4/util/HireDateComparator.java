package lab3.problem4.util;

import java.util.Comparator;
import lab3.problem4.model.Employee;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getHireDate().compareTo(e2.getHireDate());
    }

}

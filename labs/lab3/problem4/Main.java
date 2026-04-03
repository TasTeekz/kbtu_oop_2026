package lab3.problem4;

import java.util.*;
import lab3.problem4.model.*;
import lab3.problem4.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("emp1", 3000, "INS001");
        Employee e2 = new Employee("emp2", 2500, new Date(System.currentTimeMillis() - 86400000L), "INS002");
        Employee e3 = new Employee("emp3", 2800, "INS003");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();

        Employee[] employees = { e1, e2, e3 };
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.getName() + ": $" + e.getSalary());
        }
        System.out.println();

        Arrays.sort(employees, new NameComparator());
        System.out.println("after sorting by name:");
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
        System.out.println();

        Arrays.sort(employees, new HireDateComparator());
        System.out.println("after sorting by hire date:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ": " + e.getHireDate());
        }
        System.out.println();

        Manager m1 = new Manager("mngr1", 5000, new Date(), "MGR001", 1000);
        Manager m2 = new Manager("mngr2", 5000, new Date(), "MGR002", 1500);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println();

        int cmp = m1.compareTo(m2);
        if (cmp < 0) {
            System.out.println(m1.getName() + " has lower bonus than " + m2.getName());
        } else if (cmp > 0) {
            System.out.println(m1.getName() + " has higher bonus than " + m2.getName());
        } else {
            System.out.println("same salary and bonus");
        }
        System.out.println();

        Employee e4 = new Employee("emp1", 3000, "INS001");
        System.out.println("e1.equals(e4): " + e1.equals(e4));
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        System.out.println();

        Employee eClone = e1.clone();
        System.out.println("original: " + e1);
        System.out.println("cloned: " + eClone);
        System.out.println("equal? " + e1.equals(eClone));
        System.out.println("same object? " + (e1 == eClone));
        System.out.println();

        m1.getEmployees().add(e1);
        m1.getEmployees().add(e2);
        System.out.println("manager " + m1.getName() + " has " + m1.getEmployees().size() + " employees");

        Manager mClone = m1.clone();
        System.out.println("cloned manager has " + mClone.getEmployees().size() + " employees");

        m1.getEmployees().clear();
        System.out.println("original: " + m1.getEmployees().size() + " employees");
        System.out.println("cloned: " + mClone.getEmployees().size() + " employees");
        System.out.println();

        System.out.println("e1.hashCode(): " + e1.hashCode());
        System.out.println("e4.hashCode(): " + e4.hashCode());
        System.out.println("same hashCode? " + (e1.hashCode() == e4.hashCode()));
    }
}

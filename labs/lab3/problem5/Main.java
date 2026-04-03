package lab3.problem5;

import java.util.Arrays;

import lab3.problem4.model.Employee;
import lab3.problem5.model.Chocolate;
import lab3.problem5.util.Sort;
import practices.practice2.models.Time;

public class Main {
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate("choco1", 90);
        Chocolate c2 = new Chocolate("choco2", 75);
        Chocolate c3 = new Chocolate("choco3", 80);

        Chocolate[] chocolates = { c1, c2, c3 };
        System.out.println("Before sorting chocolates: " + Arrays.toString(chocolates));
        Sort.mergeSort(chocolates, 0, chocolates.length - 1);
        System.out.println("After sorting chocolates:  " + Arrays.toString(chocolates));

        Employee e1 = new Employee("emp1", 3000, "INS001");
        Employee e2 = new Employee("emp2", 2500, "INS002");
        Employee e3 = new Employee("emp3", 2800, "INS003");

        Employee[] employees = { e1, e2, e3 };
        System.out.println("Before sorting employees:  " + Arrays.toString(employees));
        Sort.mergeSort(employees, 0, employees.length - 1);
        System.out.println("After sorting employees:   " + Arrays.toString(employees));

        Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(4, 24, 33);
        Time t3 = new Time(12, 30, 50);

        Time[] times = { t1, t2, t3 };
        System.out.println("Before sorting times:      " + Arrays.toString(times));
        Sort.mergeSort(times, 0, times.length - 1);
        System.out.println("After sorting times:       " + Arrays.toString(times));
    }
}
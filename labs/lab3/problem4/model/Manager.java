package lab3.problem4.model;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> employees = new Vector<>();
    private double bonus;

    public Manager(String name, double salary, java.util.Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Vector<Employee> getEmployees() {
        return new Vector<>(employees);
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.bonus = bonus;
        cloned.employees = new Vector<>();
        for (Employee emp : employees) {
            cloned.employees.add(emp.clone());
        }
        return cloned;
    }

    @Override
    public int compareTo(Employee other) {
        int salaryComparison = super.compareTo(other);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            return Double.compare(this.bonus, otherManager.bonus);
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 &&
                employees.equals(manager.employees);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + employees.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " (Manager), Salary: " + salary + ", Hire Date: " + hireDate + ", Insurance Number: "
                + insuranceNumber + ", Bonus: " + bonus + ", Employees: " + employees.size();
    }
}

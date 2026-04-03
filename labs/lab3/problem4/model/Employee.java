package lab3.problem4.model;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, double salary, String insuranceNumber) {
        this(name, salary, new Date(), insuranceNumber);
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.salary = salary;
            cloned.hireDate = (Date) hireDate.clone();
            cloned.insuranceNumber = insuranceNumber;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0 &&
                hireDate.equals(employee.hireDate) &&
                insuranceNumber.equals(employee.insuranceNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + hireDate.hashCode();
        result = 31 * result + insuranceNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " (" + insuranceNumber + " " + salary + "/month" + ")";
    }
}

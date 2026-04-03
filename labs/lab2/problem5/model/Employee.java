package lab2.problem5.model;

public class Employee extends Person {

    private final String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        if (position == null || position.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getOccupation() {
        return "employee (" + position + ")";
    }

}

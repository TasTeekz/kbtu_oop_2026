package labs.lab2.problem5.model;

public class Student extends Person {

    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        if (major == null || major.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getOccupation() {
        return "student (" + major + ")";
    }

}

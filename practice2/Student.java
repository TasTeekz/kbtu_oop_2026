package practice2;

public class Student {
    int id;
    String name;
    int year;

    static int counter = 1;

    public Student(String name, int year) {
        this.id = counter;
        this.name = name;
        this.year = year;

        counter += 1;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int incrementYear() {
        return this.year += 1;
    }

    public String toString() {
        return "ID: " + this.id + "\nName: " + this.name + "\nYear: " + this.year;
    }
}

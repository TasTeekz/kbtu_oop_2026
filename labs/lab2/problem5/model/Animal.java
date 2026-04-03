package lab2.problem5.model;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    private final int age;

    public Animal(String name, int age) {
        if (name == null || name.isEmpty() || age < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return String.format("%s{name='%s', age=%d, sound='%s'}",
                getClass().getSimpleName(), name, age, getSound());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}

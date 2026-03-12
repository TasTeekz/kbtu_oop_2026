package labs.lab2.problem5.model;

import java.util.Vector;

public class PersonRegistry {

    private final Vector<Person> people;

    public PersonRegistry() {
        people = new Vector<>();
    }

    public boolean addPerson(Person person) {
        if (person == null || people.contains(person)) {
            return false;
        }
        people.add(person);
        return true;
    }

    public boolean removePerson(Person person) {
        return people.remove(person);
    }

    public Vector<Person> getPeople() {
        return new Vector<>(people);
    }

    public Vector<Person> getPeople(boolean hasPet) {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (person.hasPet() == hasPet) {
                result.add(person);
            }
        }
        return result;
    }

    public Vector<Person> findPeopleWithPets() {
        return getPeople(true);
    }

    public Vector<Person> findPeopleWithoutPets() {
        return getPeople(false);
    }

    @Override
    public String toString() {
        if (people.isEmpty()) {
            return "PersonRegistry: empty";
        }

        StringBuilder result = new StringBuilder("PersonRegistry:\n");
        for (Person person : people) {
            result.append("- ").append(person).append('\n');
        }
        return result.toString().trim();
    }
}

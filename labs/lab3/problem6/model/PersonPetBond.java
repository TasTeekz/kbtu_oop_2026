package lab3.problem6.model;

import lab2.problem5.model.Animal;
import lab2.problem5.model.Person;

public class PersonPetBond implements Comparable<PersonPetBond>, Cloneable, CareRoutine, PetCommunication {

    private final Person person;
    private final Animal pet;
    private int dailyCareMinutes;

    public PersonPetBond(Person person, Animal pet, int dailyCareMinutes) {
        if (person == null || pet == null || dailyCareMinutes <= 0) {
            throw new IllegalArgumentException();
        }
        this.person = person;
        this.pet = pet;
        this.dailyCareMinutes = dailyCareMinutes;
    }

    public Person getPerson() {
        return person;
    }

    public Animal getPet() {
        return pet;
    }

    public int getDailyCareMinutes() {
        return dailyCareMinutes;
    }

    public void setDailyCareMinutes(int dailyCareMinutes) {
        if (dailyCareMinutes <= 0) {
            throw new IllegalArgumentException();
        }
        this.dailyCareMinutes = dailyCareMinutes;
    }

    @Override
    public int compareTo(PersonPetBond other) {
        int byCareTime = Integer.compare(this.dailyCareMinutes, other.dailyCareMinutes);
        if (byCareTime != 0) {
            return byCareTime;
        }

        int byPetAge = Integer.compare(this.pet.getAge(), other.pet.getAge());
        if (byPetAge != 0) {
            return byPetAge;
        }

        return this.person.getName().compareToIgnoreCase(other.person.getName());
    }

    @Override
    public PersonPetBond clone() {
        try {
            return (PersonPetBond) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String feedPet() {
        return person.getName() + " feeds " + pet.getName();
    }

    @Override
    public String cleanPetArea() {
        return person.getName() + " cleans " + pet.getName() + "'s area.";
    }

    @Override
    public String callPet() {
        return person.getName() + " calls " + pet.getName() + ", and it says '" + pet.getSound();
    }

    @Override
    public String playWithPet() {
        return person.getName() + " plays with " + pet.getName();
    }

    @Override
    public String toString() {
        return String.format("%s with %s (%d y.o.), care: %d min/day",
                person.getName(), pet.getName(), pet.getAge(), dailyCareMinutes);
    }
}

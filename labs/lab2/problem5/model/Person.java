package labs.lab2.problem5.model;

import java.util.Objects;

public abstract class Person {
    private final String name;
    private final int age;
    private Animal pet;
    private Animal tempPet;
    private Person tempCaretaker;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || age < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract public String getOccupation();

    public Animal getPet() {
        return pet;
    }

    protected boolean canAcceptPet(Animal pet) {
        return pet != null;
    }

    public void assignPet(Animal pet) {
        if (!canAcceptPet(pet)) {
            throw new IllegalArgumentException();
        }
        if (hasPet()) {
            throw new IllegalStateException();
        }
        this.pet = pet;
    }

    public Animal removePet() {
        Animal removedPet = this.pet;
        this.pet = null;
        return removedPet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public boolean leavePetWith(Person caretaker) {
        if (caretaker == null || caretaker == this) {
            return false;
        }
        if (!hasPet() || tempCaretaker != null) {
            return false;
        }
        if (caretaker.hasPet() || !caretaker.canAcceptPet(this.pet)) {
            return false;
        }

        Animal transferredPet = this.removePet();
        caretaker.pet = transferredPet;
        this.tempPet = transferredPet;
        this.tempCaretaker = caretaker;
        return true;
    }

    public boolean retrievePetFrom(Person caretaker) {
        if (caretaker == null || caretaker != tempCaretaker) {
            return false;
        }
        if (hasPet() || !caretaker.hasPet()) {
            return false;
        }
        if (caretaker.pet != tempPet) {
            return false;
        }

        Animal returnedPet = caretaker.removePet();
        this.pet = returnedPet;
        this.tempPet = null;
        this.tempCaretaker = null;
        return true;
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "none";
        return String.format("%s | age: %d | occupation: %s | pet: %s", name, age, getOccupation(), petInfo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name) && Objects.equals(pet, other.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}

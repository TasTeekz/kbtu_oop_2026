package lab3.problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lab2.problem5.model.Animal;
import lab2.problem5.model.Cat;
import lab2.problem5.model.Dog;
import lab2.problem5.model.Employee;
import lab2.problem5.model.Person;
import lab2.problem5.model.Student;
import lab3.problem6.model.CareRoutine;
import lab3.problem6.model.PersonPetBond;
import lab3.problem6.model.PetCommunication;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Employee("Nurs", 30, "Developer");
        Person p2 = new Student("Olzh", 21, "Mathematics");

        Animal anm1 = new Dog("Money", 4);
        Animal anm2 = new Cat("Kit", 5);

        p1.assignPet(anm1);
        p2.assignPet(anm2);

        List<PersonPetBond> bonds = new ArrayList<>();
        bonds.add(new PersonPetBond(p1, p1.getPet(), 45));
        bonds.add(new PersonPetBond(p2, p2.getPet(), 30));

        System.out.println("bonds:");
        for (PersonPetBond bond : bonds) {
            System.out.println(bond);
        }

        Collections.sort(bonds);
        System.out.println("\nsorted bonds:");
        for (PersonPetBond bond : bonds) {
            System.out.println(bond);
        }

        PersonPetBond original = bonds.get(0);
        PersonPetBond copy = original.clone();
        copy.setDailyCareMinutes(90);
        System.out.println();
        System.out.println("original: " + original);
        System.out.println("clone: " + copy);
        System.out.println("same object? " + (original == copy));

        CareRoutine routine = original;
        PetCommunication communication = original;
        System.out.println();
        System.out.println(routine.feedPet());
        System.out.println(routine.cleanPetArea());
        System.out.println(communication.callPet());
        System.out.println(communication.playWithPet());
    }
}

package labs.lab2.problem5;

import labs.lab2.problem5.model.Animal;
import labs.lab2.problem5.model.Cat;
import labs.lab2.problem5.model.Dog;
import labs.lab2.problem5.model.Employee;
import labs.lab2.problem5.model.Person;
import labs.lab2.problem5.model.PersonRegistry;
import labs.lab2.problem5.model.PhDStudent;
import labs.lab2.problem5.model.Student;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 21, "Mathematics");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 4);

        john.assignPet(murka);
        bob.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("Initial state:");
        System.out.println(registry);

        System.out.println("\nJohn leaves pet with Alice: " + john.leavePetWith(alice));
        System.out.println(registry);

        System.out.println("\nJohn retrieves pet from Alice: " + john.retrievePetFrom(alice));
        System.out.println(registry);

        System.out.println("\nBob tries to leave dog with Alice (should be false): " + bob.leavePetWith(alice));
        System.out.println(registry);
    }
}

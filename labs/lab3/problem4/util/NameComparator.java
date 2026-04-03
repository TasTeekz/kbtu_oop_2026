package lab3.problem4.util;

import java.util.Comparator;
import lab3.problem4.model.Person;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

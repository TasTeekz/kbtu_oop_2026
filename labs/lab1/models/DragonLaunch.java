package labs.lab1.models;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people;

    public DragonLaunch() {
        people = new Vector<>();
    }

    public Person kidnap(Person p) {
        people.add(p);
        return p;
    }

    public boolean willDragonEatOrNot() {
        if (people.isEmpty()) {
            return false;
        }

        int stackTop = 0;

        for (int i = 0; i < people.size(); i++) {
            Person current = people.get(i);

            // if current person BOY and last person in stack GIRL
            if (stackTop > 0) {
                Person lastInStack = people.get(stackTop - 1);

                if (lastInStack.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    stackTop--; // Remove the pair (dragon eats them)
                    continue;
                }
            }

            // add current person to stack
            people.set(stackTop, current);
            stackTop++;
        }

        // resize the vector to match the stack size
        people.setSize(stackTop);

        return !people.isEmpty();
    }

    public void reset() {
        people.clear();
    }
}

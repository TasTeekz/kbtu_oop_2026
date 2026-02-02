package lab1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people;

    public DragonLaunch() {
        people = new Vector<>();
    }

    public void kidnap(Person p) {
        people.add(p);
        System.out.println("kidnapped: " + p);
    }

    public boolean willDragonEatOrNot() {
        if (people.isEmpty()) {
            return false;
        }

        System.out.println("\ninitial line:");
        printLine();

        int writeIndex = 0;

        for (int readIndex = 0; readIndex < people.size(); readIndex++) {
            Person current = people.get(readIndex);

            // if current person and last is B-G pair
            if (writeIndex > 0) {
                Person last = people.get(writeIndex - 1);

                if (last.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    writeIndex--; // remove the last person 
                    System.out.println(last.getName() + " and " + current.getName() + " disappeared.");
                    continue;
                }
            }

            people.set(writeIndex, current);
            writeIndex++;
        }

        people.setSize(writeIndex);

        System.out.println("\nfinal line:");
        printLine();

        int remaining = people.size();
        System.out.println("\nremaining people: " + remaining);

        if (remaining > 0) {
            System.out.println("the dragon will eat them!");
            return true;
        } else {
            System.out.println("the dragon will not eat anyone!");
            return false;
        }
    }

    private void printLine() {
        if (people.isEmpty()) {
            System.out.println("_");
            return;
        }

        for (Person p : people) {
            System.out.print(p.getGender() == Gender.BOY ? "B" : "G");
        }
        System.out.print(" -> ");
        for (Person p : people) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }

    public void reset() {
        people.clear();
    }
}

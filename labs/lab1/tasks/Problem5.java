package labs.lab1.tasks;

import labs.lab1.models.Gender;
import labs.lab1.models.Person;
import labs.lab1.models.DragonLaunch;

public class Problem5 {
    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        Object[][] tests = {
                { "test 1: BBGG - no one will remain",
                        new Gender[] { Gender.BOY, Gender.BOY, Gender.GIRL, Gender.GIRL } },
                { "test 2: GBGB - 2 people will remain",
                        new Gender[] { Gender.GIRL, Gender.BOY, Gender.GIRL, Gender.BOY } },
                { "test 3: BBB - 3 boys will remain", new Gender[] { Gender.BOY, Gender.BOY, Gender.BOY } }
        };

        for (Object[] test : tests) {
            System.out.println("\n--- " + test[0] + " ---");
            dragon.reset();

            Gender[] genders = (Gender[]) test[1];
            for (int i = 0; i < genders.length; i++) {
                Person kidnapped = dragon.kidnap(new Person(genders[i], "Person" + (i + 1)));
                System.out.println("kidnapped: " + kidnapped);
            }

            boolean willDragonEatOrNot = dragon.willDragonEatOrNot();
            System.out.println("will the dragon eat them? " + willDragonEatOrNot);
        }
    }
}
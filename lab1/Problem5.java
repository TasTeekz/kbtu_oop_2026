package lab1;

public class Problem5 {
    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        // test 1: BBGG - no one will remain
        System.out.println("--- test 1: BBGG ---");
        dragon.kidnap(new Person(Gender.BOY, "Alex"));
        dragon.kidnap(new Person(Gender.BOY, "Bob"));
        dragon.kidnap(new Person(Gender.GIRL, "Clara"));
        dragon.kidnap(new Person(Gender.GIRL, "Diana"));
        dragon.willDragonEatOrNot();

        // test 2: GBGB - 2 people will remain
        System.out.println("\n\n--- test 2: GBGB ---");
        dragon.reset();
        dragon.kidnap(new Person(Gender.GIRL, "Emma"));
        dragon.kidnap(new Person(Gender.BOY, "Frank"));
        dragon.kidnap(new Person(Gender.GIRL, "Grace"));
        dragon.kidnap(new Person(Gender.BOY, "Henry"));
        dragon.willDragonEatOrNot();

        // test 3: BBB - 3 boys will remain
        System.out.println("\n\n--- test 4: BBB ---");
        dragon.reset();
        dragon.kidnap(new Person(Gender.BOY, "Oscar"));
        dragon.kidnap(new Person(Gender.BOY, "Peter"));
        dragon.kidnap(new Person(Gender.BOY, "Quinn"));
        dragon.willDragonEatOrNot();
    }
}
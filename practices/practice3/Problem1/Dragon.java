package practices.practice3.Problem1;

public class Dragon extends Animal {
    private String name;

    public Dragon() {
        super();
        this.name = "Unnamed Dragon";
        this.species = "Dragon";
    }

    public Dragon(String name) {
        super("Dragon"); 
        this.name = name;
    }

    public void breatheFire() {
        System.out.println(name + " is breathing fire!");
    }

    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void poop() {
        System.out.println(name + " is pooping fire!");
    }

    @Override
    public void whatIsThisEating(String food) {
        System.out.println(name + " (Dragon) is eating " + food);
    }

    public void whatIsThisEating(String food, int times) {
        System.out.println(name + " is eating " + food + " " + times + " times");
    }

    public void testSuperAndThis() {
        System.out.println("\n--- test super vs this ---");
        super.poop();
        this.poop();
        super.whatIsThisEating("meat");
        this.whatIsThisEating("meat");
        this.whatIsThisEating();
        this.whatIsThisEating("meat", 3);
    }

    public void orders(String command) {
        if (command == null) {
            System.out.println(name + " received null command.");
            return;
        }

        String c = command.trim().toLowerCase();

        if ("drakaris!".equals(c)) {
            breatheFire();
        } else if ("fly".equals(c)) {
            fly();
        } else if ("poop".equals(c)) {
            poop();
        } else {
            System.out.println(name + " doesn't know how to: " + command);
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
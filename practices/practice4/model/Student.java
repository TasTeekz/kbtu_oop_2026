package practices.practice4.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
    @Override
    public void eatPizza() {
        System.out.println("student is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println("retakeExam");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void move() {
        System.out.println("move");
    }
}

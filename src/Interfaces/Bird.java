package Interfaces;

public class Bird extends Animal implements Able_to_run, AbleToFly {
    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }
}

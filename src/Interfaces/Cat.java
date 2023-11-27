package Interfaces;

public class Cat extends Animal implements Able_to_run{
    @Override
    public void eat() {
        System.out.println("Кошачий корм");
    }

    @Override
    public void run(){
        System.out.println("Кот бежит");
    }
}

package Interfaces;

public class Dog extends Animal implements Able_to_run{
    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }
    @Override
    public void run(){
        System.out.println("Собака бежит");
    }
}

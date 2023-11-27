package Interfaces;

public class Programmer implements Worker, Driver{
    public void work(){
        System.out.println("Программист работает");
    }

    @Override
    public void drive() {
        System.out.println("Программист водит машину");
    }
}

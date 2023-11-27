package Interfaces;

public class Cooker implements Worker, Driver{
    public void work(){
        System.out.println("Повар работает");
    }

    @Override
    public void drive() {
        System.out.println("Повар водит машину");
    }
}

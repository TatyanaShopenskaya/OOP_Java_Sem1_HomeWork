package Interfaces;

public class WaiterBob implements Waiter{
    @Override
    public void bring_order(String name_food) {
        System.out.println("Я вам принес "+name_food);
    }
}

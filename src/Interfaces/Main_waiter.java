package Interfaces;

public class Main_waiter {
    public static void main(String[] args) {
        Client client = new Client();
        //WaiterBob waiterBob = new WaiterBob();   // можно без создания класса офиц-та сделать, а с пом анонимного класса
        client.make_order(new Waiter() {
            @Override
            public void bring_order(String name_food) {
                System.out.println("Я вам принес " + name_food);
            }
        }, "пицца");
    }
}

package Interfaces;

public class Client {
    void make_order(Waiter waiter, String name_food){
        waiter.bring_order(name_food);            //у официанта вызываем метод принести заказ
    }
}

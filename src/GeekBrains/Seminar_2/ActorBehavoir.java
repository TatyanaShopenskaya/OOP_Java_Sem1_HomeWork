//Необходимо реализовать:
//        1. Интерфейс ActorBehavoir,который будет содержать
//        описание возможных действий актора в очереди/магазине
//        2. Абстрактный класс Actor, который хранит в себе
//        параметры актора, включая состояние готовности сделать
//        заказ и факт получения заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
//        “персональных данных” abstract
//        3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir



package GeekBrains.Seminar_2;

public interface ActorBehavoir {      //создали Интерфейс ActorBehavoir,который будет содержать описание действий актора в очереди/магазине
    void setMakeOrder(boolean makeOrder);    //метод, кот будет делать заказ
    void setTakeOrder(boolean takeOrder);   //метод, кот будет получать заказ
    boolean isMakeOrder();  //метод, кот будет говорить, сделан ли заказ
    boolean isTakeOrder();  //метод, кот будет говорить, получен ли заказ

}

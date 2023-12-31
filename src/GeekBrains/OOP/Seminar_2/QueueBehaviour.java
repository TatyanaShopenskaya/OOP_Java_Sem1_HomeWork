package GeekBrains.OOP.Seminar_2;
//Необходимо реализовать строение классов, без
//        конкретной реализации:
//        1. Интерфейс QueueBehaviour, который описывает
//        логику очереди – помещение в/освобождение из
//        очереди, принятие/отдача заказа
//        2. Интерфейс MarketBehaviour, который описывает
//        логику магазина – приход/уход покупателей,
//        обновление состояния магазина
//        3. Класс Market, который реализовывает два
//        вышеуказанных интерфейса и хранит в списке
//        список людей в очереди в различных статусах

public interface QueueBehaviour {
    void takeInQueue(Actor actor);     //метод помещения в очередь
    void makeOrders();  //метод оформления заказа
    void takeOrders();  //метод получения заказа
    void releaseFromQueue();    //метод выхода из очереди
}

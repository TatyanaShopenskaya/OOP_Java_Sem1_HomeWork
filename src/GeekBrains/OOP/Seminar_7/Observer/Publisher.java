package GeekBrains.OOP.Seminar_7.Observer;

public interface Publisher {  //interface для тех, кто будет рассылать приглашения на работу
    void registerObserver(Observer observer);    //принимает observer и регистрирует его (т.е.добавляет)
    void remove(Observer observer);   //удаляет observer
    void sendOffer(String nameCompany, int Salary);    //метод, кот.рассылает сообщения о работе
}

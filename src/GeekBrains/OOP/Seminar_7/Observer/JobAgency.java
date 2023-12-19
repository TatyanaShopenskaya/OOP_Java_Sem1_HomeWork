package GeekBrains.OOP.Seminar_7.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{     //агенство с работниками
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void sendOffer(String nameCompany, int salary) {
        for(Observer observer:observerList){
            observer.receiveOffer(nameCompany,salary);
        }
    }
}

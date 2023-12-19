package GeekBrains.OOP.Seminar_7.Observer;

import java.util.Random;

public class Junior implements Observer{   //устраивается на работу как бы "подбрасывая монетку" без указания з/п
    String name;
    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {

        if(new Random().nextBoolean()) {   //рандом (тру или фолс)
            System.out.println("Junior %s: I accept the offer! (company, salary) = " + name + " ,"+nameCompany);
        } //если тру, то он соглашается на этот оффер
        else {     //если фолс, то он будет ждать другой оффер
            System.out.println("Junior  %s: OK! I don`t accept the offer! (company, salary) = " + name + " ,"+ nameCompany);
        }
    }
}


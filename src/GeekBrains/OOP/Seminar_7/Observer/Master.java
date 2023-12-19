package GeekBrains.OOP.Seminar_7.Observer;

import java.util.Random;

public class Master implements Observer{
    String name;
    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if(salary<80) {
            System.out.println("Master %s: I am waiting for a better job! (company, salary) = " + name+" ,"+nameCompany);
        }
        else {    //в ином случае, он подождет другого выгодного предложения
            System.out.println("Master %s: OK! I am ready for this job! (company, salary) = "+ name+" ,"+nameCompany+" ,"+salary);
        }
    }
}




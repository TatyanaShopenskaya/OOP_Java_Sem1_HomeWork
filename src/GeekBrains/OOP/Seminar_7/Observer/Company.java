package GeekBrains.OOP.Seminar_7.Observer;

import java.util.Random;

public class Company{     //компания
    Publisher jobAgency;
    String nameCompany;
    int maxSalary;    //max з/п
    Random rnd;

    public Company(Publisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        rnd = new Random();
    }

    public void needEmployee(){   //метод, кот.говорит агенству, что нам нужны новые работники
        int salary = rnd.nextInt(maxSalary);   //рандомно получаем нашу з/п
        jobAgency.sendOffer(nameCompany, salary);
    }
}

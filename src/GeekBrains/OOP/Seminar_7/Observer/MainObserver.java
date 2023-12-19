package GeekBrains.OOP.Seminar_7.Observer;

import GeekBrains.OOP.Seminar_7.Observer.*;

public class MainObserver {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();    //класс, который будет рассылать в будущем объявления нашим претендентам
        Company google = new Company(jobAgency,"Google", 500);   //создали компанию
        Company geekBrains = new Company(jobAgency,"GeekBrains", 1000);
        Student petrov = new Student("Petrov");   //создали работника
        Junior ivanov = new Junior("Ivanov");
        Master sidorov = new Master("Sidorov");
        jobAgency.registerObserver(petrov);   //добавление в агентство
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for(int i=0;i<10;i++){    //пробегаемся циклом 10раз
            google.needEmployee();   //и 10 раз сообщение о том, что этой компании надо подобрать работника
            geekBrains.needEmployee();
        }
    }
}

package GeekBrains.OOP.Seminar_7.Observer;

public class Student implements Observer{      //класс Студент
    String name;
    int salary;
    public Student(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {    //если предлагают з/п больше чем раньше, то Студент соглашается

        if(this.salary<salary) {
            System.out.printf("Student %s: I need this work! (company, salary) = %s, %d%n", name, nameCompany,salary);
            this.salary = salary;
        }
        else {    //в ином случае, он подождет другого выгодного предложения
            System.out.printf("Student %s: I got better job! (company, salary) = %s, %d%n", name, nameCompany, salary);
        }
    }
}

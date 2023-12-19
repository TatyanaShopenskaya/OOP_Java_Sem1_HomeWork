package GeekBrains.OOP.Seminar_3_and_4.service;

public class TeacherSalaryCalculate {
    int salary;

    public TeacherSalaryCalculate(int salary){
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary * 1.3;
    }
}


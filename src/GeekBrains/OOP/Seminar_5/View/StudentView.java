package GeekBrains.OOP.Seminar_5.View;

import GeekBrains.OOP.Seminar_5.Model.Student;

public class StudentView {
    public void printOnConsole(Student student){   //метод, позволяющий выводить данные студентов в консоль
        System.out.println(student.toString());
    }
}

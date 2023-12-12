package GeekBrains.Seminar_5.View;

import GeekBrains.Seminar_5.Model.Student;
import GeekBrains.Seminar_5.Model.Teacher;

public class TeacherView {
    public void printOnConsole(Teacher teacher){   //метод, позволяющий выводить данные учителей в консоль
        System.out.println(teacher.toString());
    }
}


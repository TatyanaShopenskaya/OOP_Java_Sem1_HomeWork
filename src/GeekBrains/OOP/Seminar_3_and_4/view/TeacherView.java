package GeekBrains.OOP.Seminar_3_and_4.view;

import GeekBrains.OOP.Seminar_3_and_4.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {     //метод отображения в консоли
        for (Teacher i : list) {
            System.out.println(i + " ");
        }
    }
}


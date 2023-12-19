package GeekBrains.OOP.Seminar_3_and_4.controler;

import GeekBrains.OOP.Seminar_3_and_4.model.Teacher;
import GeekBrains.OOP.Seminar_3_and_4.service.TeacherService;
import GeekBrains.OOP.Seminar_3_and_4.view.TeacherView;

public class TeacherControler implements UserControler<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleTeacher() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
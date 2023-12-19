package GeekBrains.OOP.Seminar_3.controler;

import GeekBrains.OOP.Seminar_3.model.Teacher;
import GeekBrains.OOP.Seminar_3.service.TeacherService;
import GeekBrains.OOP.Seminar_3.view.TeacherView;

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
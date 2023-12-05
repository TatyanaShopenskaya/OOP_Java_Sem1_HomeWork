package GeekBrains.Seminar_3.controler;

import GeekBrains.Seminar_3.model.Teacher;
import GeekBrains.Seminar_3.service.TeacherService;
import GeekBrains.Seminar_3.view.TeacherView;

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
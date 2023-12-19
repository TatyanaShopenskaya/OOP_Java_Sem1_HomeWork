package GeekBrains.OOP.Seminar_3_and_4.controler;

import GeekBrains.OOP.Seminar_3_and_4.service.StudentService;
import GeekBrains.OOP.Seminar_3_and_4.view.StudentView;
import GeekBrains.OOP.Seminar_3_and_4.model.Student;

public class StudentControler implements UserControler<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName,secondName,lastName);
    }

    public void sendOnConsoleStudent(){
        studentView.sendOnConsole(studentService.getStudentList());

    }
}

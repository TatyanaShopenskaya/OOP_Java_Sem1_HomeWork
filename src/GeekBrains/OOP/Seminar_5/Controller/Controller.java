package GeekBrains.OOP.Seminar_5.Controller;

import GeekBrains.OOP.Seminar_5.Model.Student;
import GeekBrains.OOP.Seminar_5.Model.Teacher;
import GeekBrains.OOP.Seminar_5.Model.Type;
import GeekBrains.OOP.Seminar_5.Model.User;
import GeekBrains.OOP.Seminar_5.Service.DataService;
import GeekBrains.OOP.Seminar_5.View.StudentView;
import GeekBrains.OOP.Seminar_5.View.TeacherView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    public void createStudent(String firstName, String secondName,String lastName){     //метод по созданию конретного студента
        service.create(firstName,secondName,lastName, Type.STUDENT);  //"метод, создай нам студента"
    }
    public void getAllStudent() {   //метод вывода всех студентов
        for (User user : service.getAllStudent()) {
            studentView.printOnConsole((Student) user);
        }
    }

        private final TeacherView teacherView = new TeacherView();
        public void createTeacher(String firstName, String secondName,String lastName){     //метод по созданию конретного студента
            service.create(firstName,secondName,lastName, Type.TEACHER);  //"метод, создай нам студента"
        }
        public void getAllTeacher(){   //метод вывода всех студентов
            for (User user: service.getAllTeacher()){
                teacherView.printOnConsole((Teacher) user);
            }
    }
}

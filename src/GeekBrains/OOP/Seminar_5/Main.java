package GeekBrains.OOP.Seminar_5;

import GeekBrains.OOP.Seminar_5.Controller.ControllerGroup;
import GeekBrains.OOP.Seminar_5.Model.Teacher;
import GeekBrains.OOP.Seminar_5.Model.Student;
import GeekBrains.OOP.Seminar_5.Model.StudentGroup;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//        controller.createStudent("Ivan", "Ivanov","Ivanovich");
//        controller.createStudent("Anna", "Ivanova","Sergeevna");
//        controller.createStudent("Alla", "Popova","Antonovna");
//        controller.createTeacher("Nina", "Ivanova","Ivanovna");
//        controller.createTeacher("Igor", "Petrov","Olegovich");
//        controller.getAllStudent();
//        controller.getAllTeacher();
//    }
        Teacher teacher1 = new Teacher("Olga", "Petrova", "Ivanovna", 1);
        List<Student> students1 = List.of(
                new Student("Inna", "Sidorova", "Fedorovna", 1),
                new Student("Anna", "Sidorova", "Fedorovna", 5),
                new Student("Liza", "Popova", "Fedorovna", 13)
        );
        ControllerGroup controllerGroup1 = new ControllerGroup();
        StudentGroup group1 = controllerGroup1.createStudentGroup(teacher1, students1);

        System.out.println("Учебная группа с учителем " + group1.getTeacher() + " и студентами с Id: " +
                group1.getStudents());



        Teacher teacher2 = new Teacher("Oleg", "Popov", "Petrovich", 2);
        List<Student> students2 = List.of(
                new Student("Alisa", "Sidorov", "Fedorovna", 2),
                new Student("Petr", "Sidorov", "Fedorovich", 10),
                new Student("Stas", "Popov", "Fedorovich", 26)
        );
        ControllerGroup controllerGroup2 = new ControllerGroup();
        StudentGroup group2 = controllerGroup2.createStudentGroup(teacher2, students2);

        System.out.println("Учебная группа с учителем " + group2.getTeacher() + " и студентами с Id: " +
                group2.getStudents());
    }
}

package GeekBrains.OOP.Seminar_5.Service;

import GeekBrains.OOP.Seminar_5.Model.Student;
import GeekBrains.OOP.Seminar_5.Model.StudentGroup;
import GeekBrains.OOP.Seminar_5.Model.Teacher;
import GeekBrains.OOP.Seminar_5.Model.*;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}

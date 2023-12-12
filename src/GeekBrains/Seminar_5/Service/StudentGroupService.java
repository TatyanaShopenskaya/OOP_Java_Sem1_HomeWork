package GeekBrains.Seminar_5.Service;

import GeekBrains.Seminar_5.Model.*;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}

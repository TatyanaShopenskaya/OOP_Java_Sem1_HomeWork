package GeekBrains.Seminar_5.Controller;
import GeekBrains.Seminar_5.Model.Teacher;
import GeekBrains.Seminar_5.Model.StudentGroup;
import GeekBrains.Seminar_5.Model.Student;
import GeekBrains.Seminar_5.Service.StudentGroupService;
import java.util.List;
public class ControllerGroup {
    public StudentGroupService groupService;

    public ControllerGroup() {
        groupService = new StudentGroupService();
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return groupService.createStudentGroup(teacher, students);
    }
}


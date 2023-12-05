package GeekBrains.Seminar_3.view;
import GeekBrains.Seminar_3.model.Student;
import java.util.List;
import java.awt.*;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list) {
            System.out.println(i + " ");
        }
    }
}



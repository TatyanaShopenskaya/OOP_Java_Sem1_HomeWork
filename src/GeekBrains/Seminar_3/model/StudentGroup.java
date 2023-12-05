package GeekBrains.Seminar_3.model;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentGroup(List<Student> students) {   //создали список студентов
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){    //метод добавления студента в список
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public void remove(Student student){
        students.remove(student);
        }
    }


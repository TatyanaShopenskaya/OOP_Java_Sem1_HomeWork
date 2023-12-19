package GeekBrains.OOP.Seminar_3.service;

import GeekBrains.OOP.Seminar_3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {    //хранит группы со студентами
    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for(Student i:studentList){
            if(maxId<i.getStudentId())
                maxId = i.getStudentId();
        }
        maxId++;
        studentList.add(new Student(maxId,firstName,secondName,lastName));
    }
}

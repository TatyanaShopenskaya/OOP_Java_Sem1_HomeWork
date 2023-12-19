package GeekBrains.OOP.Seminar_3.service;

import GeekBrains.OOP.Seminar_3.model.Student;
import GeekBrains.OOP.Seminar_3.model.UserComporator;
import GeekBrains.OOP.Seminar_3.model.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {   //здесб будем описывать,что можно делать с нашими стандартными классами
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }
    public void removeStudent(Student student){
        for(Student studentItem: students){     //проходим по списку, и если такой студент есть, то удаляем его.
            if(student.equals(studentItem)){    //для этого создали public void remove() в StudentGroup
                students.remove(studentItem);
            }
    }
    }
    public List<Student> getSortedStudentGroup(){    //добавляем метод по сортировке нашего списка по ID
        List<Student> students1 = new ArrayList<>(students.getStudents());  //создали список для сортировки
        Collections.sort(students1);
        return students1;
    }

    public List<Student> getSortedStudentGroupByFIO() {    //реализуем метод сортировки студентов по фамилиям
List<Student> studentList = new ArrayList<>(students.getStudents());
studentList.sort(new UserComporator<Student>());    //<Student> - дженерик, т.е. указываем для какого класса из User будет запущен компоратор
return studentList;
    }
    }


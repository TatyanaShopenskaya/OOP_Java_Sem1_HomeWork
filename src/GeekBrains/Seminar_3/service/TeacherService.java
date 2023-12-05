package GeekBrains.Seminar_3.service;

import GeekBrains.Seminar_3.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {      //метод работы с классом учитель
    private final List<Teacher> teacherList;             //хранит группы с учителями

    public TeacherService(){
        this.teacherList = new ArrayList<>();
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {    //создание учителя
        int maxId = 0;
        for(Teacher i:teacherList){
            if(maxId<i.getTeacherId())     //автоматическое проставление ID
                maxId = i.getTeacherId();
        }
        maxId++;
        teacherList.add(new Teacher(maxId,firstName,secondName,lastName));
    }
}



package GeekBrains.Seminar_5.Service;
import GeekBrains.Seminar_5.Model.Student;
import GeekBrains.Seminar_5.Model.Teacher;
import GeekBrains.Seminar_5.Model.Type;
import GeekBrains.Seminar_5.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {      //класс, в кот будут описываться все возможжные действия с юзерами
    private List<User> userList;    //общий список для студентов и учителей, т.е. здесь хранятся все юзеры

    public DataService() {
        this.userList = new ArrayList<>();   //сюда будут добавляться все новые созданные юзеры
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getMaxId(Type type) {           //метод, который будет задавать Id студента или учителя (+1 к последнему Id) //т.е., если придет учитель, то мы ищем Id учителя (аналогично со Студентом)
        boolean itsStudent = Type.STUDENT == type;  //в этой переменной храним определение типа юзера
        int lastId = 0;
        for (User user : userList) {   //с помощью перебора устанавливаем нужный Id
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherID() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;      //возвращаем нужный id
    }

    public List<User> getAllStudent() {     //метод получения списка всех студентов
        List<User> resultList = new ArrayList<>();  //в эту переменную сохраним наш список юзеров
        for (User user : userList) {
            if (user instanceof Student)     //если это студент,
                resultList.add(user);        //то добавим его в список со студентами
        }
        return resultList;        //вернем итог.список студентов
    }

    public List<User> getAllTeacher() {     //метод получения списка всех студентов
        List<User> resultList = new ArrayList<>();  //в эту переменную сохраним наш список юзеров
        for (User user : userList) {
            if (user instanceof Teacher)     //если это учитель,
                resultList.add(user);        //то добавим его в список с учителями
        }
        return resultList;        //вернем итог.список
    }


    public List<User> getUserList(){   //метод, возвращающий весь список юзеров
        return userList;
    }
}
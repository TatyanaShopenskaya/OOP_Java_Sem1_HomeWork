package GeekBrains.OOP.Seminar_3_and_4.model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {    //создали итератор
    private final List<Student> students; //создали приватную переменную final, в кот будет храниться список со студенами
    private int counter;    ////создали приватную переменную counter, чтобы смотреть на каком элементе списка мы сейчас находимся

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;     //каунтер=0
    }

    @Override


    public boolean hasNext() {   //метод, кот говорит, есть ли у нас след элемент
        return counter< students.size();   //т.е. элемент должен быть в пределах нашего массива
    }

    @Override
    public Student next() {   //метод, кот возвращает нам след элемент
        if(hasNext()){
            return students.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {   //метод, кот говорит, чтобы элемент удалился
        students.remove(counter);
    }
}

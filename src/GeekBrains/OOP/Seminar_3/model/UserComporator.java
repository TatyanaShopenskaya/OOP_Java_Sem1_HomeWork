package GeekBrains.OOP.Seminar_3.model;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T> {    //чтобы сравнить студентов по ФИО
//T - это дженерик, т.е. обощенный тип данных
    @Override
    public int compare(T o1, T o2) {     //этот метод сравнивает двух
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}


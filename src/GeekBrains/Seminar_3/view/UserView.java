package GeekBrains.Seminar_3.view;
import GeekBrains.Seminar_3.model.User;

import java.awt.*;
import java.util.List;
//Семинар 4. Задача 2
//        � Создать интерфейс ЮзерВью
//        � Типизировать его T наследующегося от типа Юзер
//        � Создать в нем метод sendOnConsole(List<Student> students) используя
//        типизацию
//        � Создать класс СтудентВью реализующий созданный интерфейс
public interface UserView<T extends User> {   //<T extends User> - значит, что мы здесь работаем с дженериком,ннаследуемым от нашего Юзера
    void sendOnConsole(List<T> list);
    }


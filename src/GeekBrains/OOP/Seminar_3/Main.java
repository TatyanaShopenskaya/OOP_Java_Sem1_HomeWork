//Задача 1 - Iterator
//        � Создать класс Студент
//        � Создать класс УчебнаяГруппа
//        � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
//        интерфейс Iterator
//        � Реализовать его контракты (включая удаление)



//Задача 2 - Iterable
//        � Модифицировать класс УчебнаяГруппа, заставив его реализовать
//        интерфейс Iterable
//        � Реализовать метод iterator() возвращающий экземпляр созданного нами
//        итератора
//        � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
//        студента по ФИО
//        � Создать класс Контроллер, добавив в него метод удаления студента и
//        вызывать в нем созданный метод из УчебнаяГруппаСервис

//Задача 3 - Comparable
//        � Модифицировать класс Студент, заставив его реализовать интерфейс
//        Comparable
//        � Реализовать контракт compareTo () со сравнением по какому-либо
//        параметру (пример studentId)
//        � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
//        сортировки списка студентов по id
//        � Модифицировать класс Контроллер, добавив в него метод сортировки
//        списка студентов по id и вызывать в нем созданный метод из
//        УчебнаяГруппаСервис

//Задача 4 - Comparator
//        � Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//        � Реализовать контракт compare () со сравнением по какому-либо параметру
//        (пример: сочетание Имя+Фамилия)
//        � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
//        сортировки списка студентов по ФИО
//        � !!!!! ЭТО БУДЕМ ДЕЛАТЬ ПОЗЖЕ!!!!!! Модифицировать класс Контроллер, добавив в него метод сортировки
//        списка студентов по ФИО и вызывать в нем созданный метод из
//        УчебнаяГруппаСервис

package GeekBrains.OOP.Seminar_3;

import GeekBrains.OOP.Seminar_3.controler.TeacherControler;

public class Main {
    public static void main(String[] args) {
        TeacherControler teachertControler = new TeacherControler();
        teachertControler.create("Olga","Ivanova","Ivanovna");
        teachertControler.create("Oleg","Ivanov","Ivanovich");
        teachertControler.create("Tatyana","Ivanova","Ivanovna");
        teachertControler.sendOnConsoleTeacher();




//        StudentControler studentControler = new StudentControler();
//        studentControler.create("Olga","Ivanova","Ivanovna");
//        studentControler.create("Oleg","Ivanov","Ivanovich");
//        studentControler.create("Tatyana","Ivanova","Ivanovna");
//        studentControler.sendOnConsoleStudent();   //вывод в консоль





//        Student student2 = new Student(2,"Oleg","Pivanov","Petrovich");
//        Student student3 = new Student(1,"Vadim","Petrov","Petrovich");
//        Student student3 = new Student(1,"Vadim","Petrov","Petrovich");
//        Student student4 = new Student(3,"Anna","Aidorova","Ivanovna");
//        Student student1 = new Student(4,"Olga","Ivanova","Ivanovna");
//        Student student2 = new Student(2,"Oleg","Pivanov","Petrovich");
//        Student student3 = new Student(1,"Vadim","Petrov","Petrovich");
//        Student student4 = new Student(3,"Anna","Aidorova","Ivanovna");
//        List<Student> students = new ArrayList<>(); //сделали из студентов список
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        StudentGroup studentGroup = new StudentGroup(students);    //эти 3 строчки эта и ниже к задаче №2
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for(Student student: studentGroup){       //вывод с пом for each, благодаря iterable()
//            System.out.println(student);
//        }
////        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup); //эти 3 эта и ниже строчки к задаче №1
////        while (groupIterator.hasNext()){
////            System.out.println(groupIterator.next());
////        }
//        System.out.println("---------------------------");
//        for(Student student: service.getSortedStudentGroup()){       //вывод отсортированного списка студентов по id
//            System.out.println(student);
//        }
//        System.out.println("---------------------------");
//        for(Student student: service.getSortedStudentGroupByFIO()){       //вывод отсортированного списка студентов по ФИО
//            System.out.println(student);
//        }
    }
}

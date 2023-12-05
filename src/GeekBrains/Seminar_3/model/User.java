package GeekBrains.Seminar_3.model;
//Семинар 4. Задача 1
//        � Создать класс Юзер и перенести в него базовые поля ( ФИО )
//        � Модифицировать ранее созданный класс СтудентКомпаратор
//        � Переименовать в ЮзерКомпаратор
//        � Типизировать его T наследующегося от типа Юзер ( T extends User )
//        � Типизировать реализуемый интерфейс Компаратор T
//        � Изменить метод компаре, внеся во входные данные вместо конкретных
//        классов типизацию T
//        � Внести правки места, где использовался предыдущий компаратор
public class User {    //общий класс для всех наших людей (по 1 заданию из  семинара 4)
    private String firstName;
    private String secondName;
    private String lastName;


    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

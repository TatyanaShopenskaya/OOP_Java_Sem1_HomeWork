public class Employee {
    String name;
    String post;
    double salary;

    Employee (String name, String post, double salary) {    //создаем конструктор, в котором будет инициализ-ть параметры
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println(name+", "+post+", "+salary);
    }
}

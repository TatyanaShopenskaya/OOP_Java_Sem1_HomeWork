package Main.HW;

public class Human {
    String name;
    int age;
    int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override        //переопределяем встроенный метод toString(), чтобы объект  преобразовался в строку, и в консоль выводились понятные сведения
    public String toString() {
        //return ("Name "+name + ", "+"age " + age);
        return String.format("Name: %s, age: %s", name, age);   //можно сделать такую запись
    }
}



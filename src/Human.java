public class Human {
    private String name;
    private double age;
    private double weight;

    public Human(String name, double age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age){    //создаем сеттер, чтобы выведенный приватный возраст можно было использовать в дальнейших вычислениях
        if(age>=0){                 //сеттер - дает возможность установить значения приватных полей
            this.age=age;
        }
    }

    public String getName() {    //создаем геттер, чтобы возвращать имя (вернуть строку)
        return name;
    }
    public double getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
}

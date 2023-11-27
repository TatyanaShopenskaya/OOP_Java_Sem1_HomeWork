package Inheritance;

public class Cat extends CatFamily {     //extends - указывает на то, что это наследуемый класс от класса CatFamily
    public Cat() {
        super(4,2,false);
        legs = 5;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}

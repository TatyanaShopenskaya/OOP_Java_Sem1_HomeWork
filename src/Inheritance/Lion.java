package Inheritance;

public class Lion extends CatFamily {     //extends - указывает на то, что это наследуемый класс от класса CatFamily
    public Lion(){
        super(4,2,true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
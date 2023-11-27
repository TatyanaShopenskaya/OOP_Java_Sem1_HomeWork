package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // МОЖНО СДЕЛАТЬ ТАК:
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<Able_to_run> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
//        animals.add(fish);
//        for (Animal animal:animals){
//            animal.eat();
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();
//        }

        for (Able_to_run animal : animals) {
            animal.run();
        }

        }
    }


        // ИЛИ МОЖНО СДЕЛАТЬ ТАК:
//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;     //это downcast - приведение, без него не сможем вызвать run() - т.к. его нет в родительском классе
//        dog.run();
//    }


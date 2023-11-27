public class Main3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Hugo";
        dog1.type = "koker";
        dog1.weight = 15;
        dog1.speed = 5;

        String dogString = dog1.getString();
        System.out.println(dogString);
        dog1.run();


        Dog dog2 = new Dog();
        dog2.name = "Sam";
        dog2.type = "ovcharka";
        dog2.weight = 20;
        dog2.speed = 3;

        String dog2String = dog2.getString();
        System.out.println(dog2String);
        dog2.run();
    }
}

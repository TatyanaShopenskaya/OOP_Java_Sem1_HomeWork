public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Olga", 23,40);
        human1.setAge(40);
//        human1.name = "Olga";
//        human1.age = 23;
//        human1.weight = 40;
        Human human2 = new Human("Viktor",33,60);
        //human2.setAge(-20);
//        human2.name = "Viktor";
//        human2.age = 33;
//        human2.weight = 60;
        Human human3 = new Human("Anna",20,42);
        //human3.setAge(20);
//        human3.name = "Anna";
//        human3.age = 20;
//        human3.weight = 42;

        //double ageSr = (human1.age+ human2.age+ human3.age)/3;
        //System.out.println(ageSr);
        System.out.println(human1.getName()+";"+human1.getAge()+";"+human1.getWeight());
    }
}

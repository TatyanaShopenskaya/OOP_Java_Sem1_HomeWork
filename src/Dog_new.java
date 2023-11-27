public class Dog_new {
    String name;
    int age;
    int weight;
    int speed;

    String getDogNew() {
        return name + " " + age + " " + weight;
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }
}

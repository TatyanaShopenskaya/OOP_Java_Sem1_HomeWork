public class Dog {
    String name;
    String type;
    int weight;
    int speed;

    String getString() {
        return name + "," + type + "," + weight;
    }
    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("бегу");
        }
    }
}

public class Monster1 {
    int eyes;
    int hands;
    int legs;


    Monster1(int count) {
        this(count, count, count);
    }

    Monster1() {
        this(2);
    }

    Monster1(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.hands = legs;
    }

    void voice() {
        System.out.println("Grrrrrrrrrrrr");
    }

    void voice(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Grrrrrrrrrrrr");
        }
    }

    void voice(int count, String string) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }
}


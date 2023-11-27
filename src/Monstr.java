public class Monstr {
    int totalEyes;
    int totalHands;
    int totalLegs;

    Monstr(int totalEyes, int totalHands, int totalLegs) {    // первый конструктор c 3 передаваемыми параметрами
        this.totalEyes = totalEyes;
        this.totalHands = totalHands;
        this.totalLegs = totalLegs;
    }

    Monstr(int count) {                                      // второй конструктор (с 1 параметром)
        this(count, count, count);
    }

    Monstr() {                                              // третий конструктор без параметров
        this(2);
    }


    //реализация метода Voice:


    void voice(int count, String word) {       //c 1 параметром count
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }


    void voice(int count) {       //c 1 параметром count
        for (int i = 0; i < count; i++) {
            System.out.println("Aaaaaaaaaaaarrrrrr");
        }
    }

    void voice() {                           //без параметров
        System.out.println("Aaaaaaaaaaaarrrrrr");
    }
}

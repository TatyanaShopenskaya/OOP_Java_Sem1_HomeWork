
import java.util.Random;

//public class Main_random {
//    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            int a = random.nextInt(5,11);
//            System.out.print(a + " ");
//        }
//    }
//}

//случайные броски кубиков
public class Main_random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(1,7);
            String result = String.format("Ваш бросок кубика %s показал:%S", i+1, a);
            System.out.println(result);
        }
    }
}

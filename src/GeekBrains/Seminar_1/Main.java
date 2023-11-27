package GeekBrains.Seminar_1;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Product> bottleOfWaters = new ArrayList<>();
        bottleOfWaters.add(new BottleOfWater("aaa", 123, 55));
        bottleOfWaters.add(new BottleOfWater("bbb", 222, 60));
        bottleOfWaters.add(new BottleOfWater("ddd", 100, 45));
        bottleOfWaters.add(new BottleOfWater("ddd", 10, 20));

        System.out.println(bottleOfWaters);
        System.out.println("--------------");
        BottleOfWaterVendingMachine bottle = new BottleOfWaterVendingMachine();
        bottle.initsProducts(bottleOfWaters);

        System.out.println(bottle.getProduct("ddd"));
        System.out.println(bottle.getProduct("aaa", 20));
        System.out.println(bottle.getProduct("ddd", 20));
    }
}



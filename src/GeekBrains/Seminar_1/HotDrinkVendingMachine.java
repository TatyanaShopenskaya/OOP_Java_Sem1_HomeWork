package GeekBrains.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private List<HotDrink> hotDrinks = new ArrayList<>(); //создали список для горячих напитков

    @Override
    public void initsProducts(List<Product> productList) {
        for (Product i : productList)
            hotDrinks.add((HotDrink) i);
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink i : hotDrinks)
            if (i.getName().equals(name))
                return i;
        return null;
    }

    public Product getProduct(String name, double volume, int temp) {
        for (HotDrink i : hotDrinks)
            if (i.getName().equals(name) && volume == i.getVolume() && temp == i.getTemp())
                return i;
        return null;
    }
}

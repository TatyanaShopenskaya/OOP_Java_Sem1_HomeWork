package GeekBrains.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {    //сделали автомат для выдачи воды и наследуем его через иентерфейс

    private List<BottleOfWater> bottleOfWaters = new ArrayList<>(); //создали список

    @Override
    public void initsProducts(List<Product> productList) {
        for (Product i : productList)
            bottleOfWaters.add((BottleOfWater) i);
    }


    @Override
    public Product getProduct(String name) {
        for (BottleOfWater i : bottleOfWaters)
            if (i.getName().equals(name))
                return i;
        return null;
            }

//@Override
    public Product getProduct(String name, double volume) {
        for (BottleOfWater i : bottleOfWaters)
            if (i.getName().equals(name) && volume == i.getVolume())
            return i;

        return null;
    }
    }




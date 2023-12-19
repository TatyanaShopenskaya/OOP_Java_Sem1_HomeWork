package GeekBrains.OOP.Seminar_7.FabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFabric {
    public static void main(String[] args) {
        List<ItemGen> gens = new ArrayList<>();    //создали список генераторов
        gens.add(new GoldGenerator());   //добавили в список генератор сундука с золотом
        gens.add(new GemGenerator());    //добавили в список генератор сундука с изумрудом
        Random rnd = new Random();   //создали рэндом
        for(int i=0;i<10;i++){     //через рэндом пробегаемся по циклу
            int rndInt = Math.abs(rnd.nextInt());   //получаем  рандомное число, abs - обернули, что бы не было отриц.чисел
            IGameItem item = gens.get(rndInt%gens.size()).createItem();   //этой записью получаем или генератор золота, или генератор изумруда (т.е. индекс 1 или 0) - с пом.остатка от деления
                                                          //и сразу создали  с помощью .createItem()
            item.open(); //открыли созданный сундук
        }
    }

}

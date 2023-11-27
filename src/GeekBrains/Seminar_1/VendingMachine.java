package GeekBrains.Seminar_1;

//public class VendingMachine {    //создали торговый автомат (это своего рода инструкция для него). Надо сделать его интерфэйсом
//private List<Product> productList;   //создали приватный список с продуктами
//    public void initsProducts(List<Product> productList){    //метод инициализации продукта из списка
//        this.productList = productList;    //инициализировали список
//    }
//
//    public Product getProduct(String name){      //метод возврата названия продукта
//        for (Product i: productList){
//            if(i.getName().equals(name))
//                return i;
//        }
//        return null;    //если нет совпадений, то вернется null
//    }
//}


import java.util.List;

// Задача 3 - Наследование � Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
public interface VendingMachine {    //создали торговый автомат (это своего рода инструкция для него). Надо сделать его интерфэйсом
    public void initsProducts(List<Product> productList); //метод инициализации продукта из списка

    public Product getProduct(String name);
    //public Product getProduct(String name, double volume);
    }


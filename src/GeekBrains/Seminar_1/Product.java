// Задача 1 - Абстракция � Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List ) сохраняющий в себе список исходных продуктов и getProduct(String name)

// Задача 2 - Инкапсуляция � Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода сделанного в предыдущем задании.

// Задача 3 - Наследование � Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

// Задача 4 - Полиморфизм � Переопределите метод toString для Товара, запустите программу, после этого переопределите для наследника этот метод, после запуска обратите внимание на изменение поведения. � Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)



package GeekBrains.Seminar_1;

public abstract class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

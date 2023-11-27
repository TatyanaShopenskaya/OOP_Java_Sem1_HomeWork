package Interfaces;

import java.util.ArrayList;

public class Main_worker_driver {
    public static void main(String[] args) {
        Director director = new Director();
        Cooker cooker = new Cooker();
        Programmer programmer = new Programmer();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(cooker);
        workers.add(programmer);
        for (Worker worker : workers) {
            worker.work();

        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(cooker);
        drivers.add(programmer);
        for(
                Driver driver:drivers) {
            driver.drive();
        }


        director.force(new Worker() {  // вызвали директора, который засталяет(force) программиста работать
// экземпляр анонимного класса
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });
    }
}

package multiThreading;

import java.util.Random;

public class MainPlayNumber {
    static boolean winner = false;

    public static void main(String[] args) {

        int bound = 1_000_000_000;

        Random random = new Random();
        int number = random.nextInt(bound);   //задали случайное число

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do{
                    option = random.nextInt(bound);   //задали случ число, кот будет выбираться для проверки
            }
            while (option != number);
                    winner = true;
                    System.out.println("Winner - " + option);
                }
        });
        thread3.start();  //запустили 1 поток


        Thread thread4 = new Thread(new Runnable() {  //создали 2ой поток - таймер для вывода секунд
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (winner) {
                        break;    //завершение второго процесс,после того, как первый процесс дойдет до 5
                    }
                        System.out.println(i);
                    try {
                        Thread.sleep(1000);   //чтобы единички выводились через 1 сек(т.е. 1000 милисек)1 поток
                    } catch (
                            InterruptedException e) {      //ничего с этой ошибкой делать не будем, просто обойдем исключение
                    }
                }
            }
        });

        thread4.start();  //запустили thread
    }
}


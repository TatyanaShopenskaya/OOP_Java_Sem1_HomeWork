package multiThreading;   //многопоточность//выполнение 2х задач одновременно, реализуем через таймер, единички выводятся каждую секунду

public class Main {

    static boolean isFive = false;    //когда первый процесс дойдет до 5, 2 процесс завершится
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {  //создали экземпляр анонимного класса

            public void run() {
                try {
                    for (int i = 0; i < 10_000_000; i++) {
                        if(i==5){
                            isFive=true;
                        }
                        System.out.println(i);
                        Thread.sleep(1000);   //чтобы единички выводились через 1 сек(т.е. 1000 милисек)
                    }
                } catch (InterruptedException e) {
                    //ничего с этой ошибкой делать не будем, просто обойдем исключение
                }
            }


        });

        Thread thread2 = new Thread(new Runnable() {  //создали 2ой таймер

            public void run() {
                try {
                    for (int i = 0; i < 10_000_000; i++) {
                        if(isFive){
                            break;    //завершение второго процесс,после того, как первый процесс дойдет до 5
                        }
                        System.out.println(i);
                        Thread.sleep(1000);   //чтобы единички выводились через 1 сек(т.е. 1000 милисек)
                    }
                } catch (InterruptedException e) {
                    //ничего с этой ошибкой делать не будем, просто обойдем исключение
                }
            }
        });
        thread.start();  //запустили thread
        thread2.start();  //запустили thread
//        for (int i = 0; i < 10_000_000; i++) {
//            System.out.println(2);
 //       }
    }
}

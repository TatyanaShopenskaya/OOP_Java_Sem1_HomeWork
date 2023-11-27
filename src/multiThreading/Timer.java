package multiThreading;

public class Timer implements Runnable{

    public void run(){
for (int i=0; i<1_000_000; i++){
            System.out.println(1);
        }
    }
}

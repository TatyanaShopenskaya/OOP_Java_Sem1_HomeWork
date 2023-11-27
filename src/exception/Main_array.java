package exception;

import java.util.ArrayList;

public class Main_array {
    public static void main(String[] args) {
        int size = 5;
        int[] numbers = new int[size];
        try {
            System.out.println(numbers[8]);
            } catch (Exception e) {
                System.out.println("Вы вышли за пределы массива");
            }
        }
    }


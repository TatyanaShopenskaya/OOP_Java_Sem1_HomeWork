public class MyMath {

    private static final double PI = 3.14;    //static - т.к. знчение всегда 3.14

    //final - значит, что значение можно присовить только 1 раз! в момент ее создания - ЭТО создание константы (пишется большими буквами)
//    public static int sum(int... numbers) {        //метод, который возвращает сумму эл-тов
//        //(int...numbers) - значит, что вместо массива чисел мы передаем сколько угодно эл-тов массива, передаем элементы переменной длины varAr
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;


        public static double length ( double radius){   //метод вызова длины окружности
            return 2 * PI * radius;
        }
        public static double area ( double radius){   //метод вызова длины круга
            return PI * radius * radius;
        }
        public static int multiple ( int a, int b){    //static - показывает, что методы не привязаны к конкр объекту
            return a * b;
        }

        public static double multiple ( double a, double b){
            return a * b;
        }

        public static int multiple ( int a){
            return a * a;
        }
    }



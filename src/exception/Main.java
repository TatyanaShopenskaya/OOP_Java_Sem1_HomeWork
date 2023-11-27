package exception;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;        //если бы а было бы = 0
            int c = Integer.parseInt("hhhhhhhh");
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя!");
//        } catch (NumberFormatException e1) {
//            System.out.println("NumberFormatException");
        } catch (Exception e) {   //чтобы все исключения сразу обрабатывались
            System.out.println("Поймано исключение!" + e.getClass());
        }
        System.out.println("Привет!");
    }
}

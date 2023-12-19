package GeekBrains.UnitTests.Lection1;

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Результат операции: %s\n", calculation(2, 2, '+'));
        System.out.printf("Результат операции: %s\n", calculation(4, 2, '-'));
        System.out.printf("Результат операции: %s\n", calculation(8, 2, '/'));
        System.out.printf("Результат операции: %s\n", calculation(3, 2, '*'));

        System.out.printf("Результат операции: %s\n", calculation(3, 2, '_'));   //ошибка _
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
        }
        return result;
    }
}

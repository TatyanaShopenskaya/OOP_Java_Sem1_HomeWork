package GeekBrains.OOP.Calculator;
import java.util.Scanner;

    public class ViewCalculator {

        private CalculatorWorkInterface calculatorWork;

        public ViewCalculator(CalculatorWorkInterface calculatorWork) {
            this.calculatorWork = calculatorWork;
        }

        public void start() {
            while (true) {
                int number1 = promptInt("Введите первое число: ");
                Calculable calculator = calculatorWork.create(number1, true);
                while (true) {
                    String cmd = prompt("Введите знак арифметического действия (*, +, /, =) : ");
                    if (cmd.equals("+")) {
                        int number2 = promptInt("Введите второе число: ");
                        calculator.sum(number1, number2);
                        continue;
                    }
                    if (cmd.equals("*")) {
                        int number2 = promptInt("Введите второе число: ");
                        calculator.multi(number1, number2);
                        continue;
                    }
                    if (cmd.equals("/")) {
                        int number2 = promptInt("Введите второе число: ");
                        calculator.divide(number1, number2);
                        continue;
                    }
                    if (cmd.equals("=")) {
                        int result = calculator.getResult();
                        System.out.println("Итог - "+result);
                        break;
                    }
                }
                break;
            }
        }


                private String prompt (String message){
                    Scanner in = new Scanner(System.in);
                    System.out.print(message);
                    return in.nextLine();
                }

                private int promptInt (String message){
                    Scanner in = new Scanner(System.in);
                    System.out.print(message);
                    return Integer.parseInt(in.nextLine());
                }
            }

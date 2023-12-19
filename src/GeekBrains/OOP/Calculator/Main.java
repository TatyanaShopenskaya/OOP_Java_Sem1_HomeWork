package GeekBrains.OOP.Calculator;

import GeekBrains.OOP.Calculator.Service.CalculatorWork;
import GeekBrains.OOP.Calculator.Service.CalculatorWorkInterface;
import GeekBrains.OOP.Calculator.View.ViewCalculator;

public class Main {
    public static void main(String[] args) {

                CalculatorWorkInterface calculatorWork = new CalculatorWork();
                ViewCalculator view = new ViewCalculator(calculatorWork);
                view.start();
            }
        }

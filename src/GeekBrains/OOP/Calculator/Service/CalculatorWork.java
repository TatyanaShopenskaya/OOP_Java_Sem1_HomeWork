package GeekBrains.OOP.Calculator;

public class CalculatorWork implements CalculatorWorkInterface{
    public Calculable create(int result, boolean flag) {
        if (flag) {
            Calculable calculator =  new Calculator(result);
            return new PrintMessageCalculator(calculator);
        }
        return new Calculator(result);
    }
}


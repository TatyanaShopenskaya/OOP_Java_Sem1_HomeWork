package GeekBrains.OOP.Calculator;

import GeekBrains.OOP.Calculator.Calculable;

public class Calculator implements Calculable {
    int result;

    public Calculator(int result) {
        this.result = result;
    }

    @Override
    public Calculator sum(int number1, int number2) {
        result = number1+number2;
        return this;
    }

    @Override
    public Calculator multi(int number1, int number2) {
        result = number1*number2;
        return this;
    }

    @Override
    public Calculator divide(int number1, int number2) {
        result = number1/number2;
        return this;
    }

    @Override
    public int getResult() {
        return result;
    }

}
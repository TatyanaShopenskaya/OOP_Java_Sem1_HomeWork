package GeekBrains.OOP.Calculator.Model;

public interface Calculable{
    Calculable sum(int number1, int number2);

    Calculable multi(int number1, int number2);

    Calculable divide(int number1, int number2);

    int getResult();


}




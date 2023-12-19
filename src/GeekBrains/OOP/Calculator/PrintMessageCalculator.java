package GeekBrains.OOP.Calculator;

public class PrintMessageCalculator implements Calculable{
        protected Calculable calculat;
        PrintMessage calcLogger = new PrintCalculator();


        public PrintMessageCalculator(Calculable calculat) {
            calcLogger.printMessage("" + calculat.getResult());
            this.calculat = calculat;
        }


        @Override
        public Calculable sum(int number1, int number2) {
            calcLogger.printMessage(calculat.getResult() + " + " + number1+number2);
            return this.calculat.sum(number1,number2);
        }

        @Override
        public Calculable multi(int number1,int number2) {
        calcLogger.printMessage(calculat.getResult() + " * " + number1*number2);
        return this.calculat.multi(number1,number2);
    }

    @Override
    public Calculable divide(int number1, int number2) {
        calcLogger.printMessage(calculat.getResult() + " / " + number1/number2);
        return this.calculat.divide(number1,number2);
    }

    @Override
        public int getResult() {
            int result = this.calculat.getResult();
            calcLogger.printMessage(" = " + result);
            return this.calculat.getResult();
        }
    }


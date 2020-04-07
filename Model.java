public class Model {

    public double calculate(double number1, double number2, String operation) throws ArithmeticException{

        switch (operation){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                try {
                    return number1 / number2;
                }catch (ArithmeticException e){
                }
        }

        return 0;
    }
}

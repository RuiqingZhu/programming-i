package session9;

/**
 * Create a class that accepts 3 parameters in the main method
 * num1 operand num2
 * and does the operation and returns the result
 */
public class Calculator {
    public static void main(String[] args) {
        // having 2 numbers and an operand
        // printing the result
        double num1 = Double.parseDouble(args[0]);
        char operand = args[1].charAt(0);
        double num2 = Double.parseDouble(args[2]);

        double result = calculate(num1, num2, operand);
        System.out.printf("%.2f %c %.2f = %.2f", num1, operand, num2, result);
    }

    private static double calculate(double num1, double num2 , char operand){
        double result = 0.0;
        switch (operand){
            case '+' :
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
        }
//        switch (operand){
//            case '+':
//                return num1 + num2;
//            case '-':
//                return num1 - num2;
//        }
        return result;
    }

    private static double sum(double num1, double num2){
        return num1 + num2;
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1 ;
        double number2 ;
        double result ;
        char operator;

       // user enter numbers
        System.out.println("Please enter first number:");
        number1 = scanner.nextDouble();

        System.out.println("Please enter second number:");
        number2 = scanner.nextDouble();

        // user enter operator
        System.out.println("Please select operator: +, -, *, /");
        operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                result=number1+number2;
                System.out.println(result);
                break;

            case '-':
                result=number1-number2;
                System.out.println(result);
                break;

            case '*':
                result=number1*number2;
                System.out.println(result);
                break;

            case '%':
                result=number1%number2;
                System.out.println(result);
                break;

                //default statement
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}

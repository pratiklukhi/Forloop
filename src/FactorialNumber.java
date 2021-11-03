import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to get factorial number:");
        int i, fact = 1;
        int number = scanner.nextInt();

        for (i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of this number is:" + fact);
    }
}

import java.util.Scanner;

public class ReverseNumber {
    public static void main(CountNumber[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sequence of the number:");
        int reverse = 0;
        int number = scanner.nextInt();

    //we have not mentioned the initialization part of the for loop
        for (;number != 0 ; number = number/10){
            int remainder = number % 10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("The reverse of given sequence is :" + reverse);
    }
}

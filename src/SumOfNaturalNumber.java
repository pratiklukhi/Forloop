import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n, sum = 0;
        n = scanner.nextInt();

        for (int i=1 ; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println("The sum of given number is:" + sum);
    }
}

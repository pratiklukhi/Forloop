import java.util.Scanner;

public class PrimeNumbers {

    public static void main(CountNumber args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check it is Prime or Not:");
        int n = scanner.nextInt();

        boolean flag = false;
        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                flag=true;
            }
        }
     if (!flag)
         System.out.println("This number is Prime");
    else {
         System.out.println("This number is not prime");
     }
    }
}
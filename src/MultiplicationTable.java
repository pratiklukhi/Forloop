import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number;
        int multiplier;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
       number = scanner.nextInt();

       for (multiplier=1; multiplier<=12; multiplier++){
           System.out.println(number + "*" + multiplier + "=" + number*multiplier);
       }
    }
}

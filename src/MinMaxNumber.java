import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 3;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Please enter numbers:" + numbers);
        for (int a =0; a<numbers; a++){
            int current = scanner.nextInt();
            if(current > max)
            {max = current;}
            if (current < min)
            {
                min = current;
            }
        }
        System.out.println("largest of "+ numbers + " number is:" + max);
        System.out.println("smallest of "+ numbers + " number is:" + min);
    }
}

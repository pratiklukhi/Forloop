public class FibonacciNumber {
    public static void main(CountNumber[] args) {
        int n;
        int maxnumber = 'n';
        int previousnumber = 0;
        int nextnumber = 1;

        System.out.println("Fibonacci number is: ");

        for (int i=1; i<=maxnumber; ++i){
            System.out.println(previousnumber +"");

            int sum = previousnumber + nextnumber;
            previousnumber = nextnumber;
            nextnumber=sum;
        }
    }
}

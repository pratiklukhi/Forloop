public class DivisionNumber {
    public static void main(String[] args) {
        for (int i = 1; i<=100 ; i++){

        //Division by 3

            if (i%3==0){
                System.out.println(i + " is Divide by 3");
            }

            //Division by 5
                if (i%5==0){
                    System.out.println(i + " is Divide by 5");
            }

                    if (i%3==0 && i%5==0) {
                        System.out.println(i + "is Divide by 3 & 5");
                    }
        }

    }
}

public class CountNumber {
    public static void main(String[] args) {
    String activity = "Pratik is playing a cricket";
    int count = 0;

    //count 'a' in given string
        for (int i=0; i<activity.length(); i++){
            if (activity.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Number of 'a' in this string :" + count);
    }
}

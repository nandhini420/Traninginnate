import java.util.*;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        
        System.out.println(count);
    }
}

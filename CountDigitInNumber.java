import java.util.*;

public class CountDigitInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ld;
        long n = sc.nextLong();
        int a = sc.nextInt();
        int count = 0;

        while (n > 0) {
             ld = n % 10 ;
            n = n / 10 ;
            if ( ld == a)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}

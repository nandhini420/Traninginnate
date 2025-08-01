import java.util.*;

public class DigitProductCalculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ld;
        long sum = 1;

        while (n > 0) {
           ld = n % 10;
            sum=sum * ld ;
            n = n / 10;
        }
        
        System.out.println(sum);
    }
}

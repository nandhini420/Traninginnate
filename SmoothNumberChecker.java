import java.util.*;

public class SmoothNumberChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  
        long B = sc.nextLong();  
         if (n == 1) {
            System.out.println("Smooth Number");
            return;
        }

        if (n <= 0) {
            System.out.println("Not a Smooth Number");
            return;
        }
            while (n % 2 == 0) {
            if (2 > B) {
                System.out.println("Not a Smooth Number");
                return;
            }
            n /= 2;
        }
            for (long i = 3; i <= n / i; i += 2) {
            while (n % i == 0) {
                if (i > B) {
                    System.out.println("Not a Smooth Number");
                    return;
                }
                n /= i;
            }
        }

        if (n > 1 && n > B) {
            System.out.println("Not a Smooth Number");
        } else {
            System.out.println("Smooth Number");
        }
    }
}

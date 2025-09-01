import java.util.*;

public class Kaprekarnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int digits = 0;
        int n = t;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        long s = (long) t * t;   
        long pow = 1;
        for (int i = 0; i < digits; i++) {   
            pow *= 10;
        }

        long right = s % pow;
        long left = s / pow;

        if (left + right == t) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}

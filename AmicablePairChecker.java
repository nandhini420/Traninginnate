import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AmicablePairChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                a += i;
            }
        }
        for (int i = 1; i <= m / 2; i++) {
            if (m % i == 0) {
                b += i;
            }
        }

        if (a == m && b == n) {
            System.out.println("Amicable Pair");
        } else {
            System.out.println("Not a Amicable Pair");
        }
    }
}

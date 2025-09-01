import java.io.*;
import java.util.*;

public class Compatiblearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        long a[] = new long[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextLong();
        }

        int n2 = sc.nextInt();
        long b[] = new long[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextLong();
        }
        if (n1 != n2) {
            System.out.println("Incompatible");
            return;
        }
        for (int i = 0; i < n1; i++) {
            if (a[i] < b[i]) {
                System.out.println("Incompatible");
                return;
            }
        }
        System.out.println("Compatible");
    }
}

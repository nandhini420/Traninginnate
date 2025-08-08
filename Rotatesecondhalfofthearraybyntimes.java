import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Rotatesecondhalfofthearraybyntimes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int half = size / 2;
        int[] b = Arrays.copyOfRange(a, 0, half);
        int[] c = Arrays.copyOfRange(a, half, size);
        int n = c.length;

        int r = k % n;
        for (int i = 0; i < r; i++) {
            int first = c[0];
            for (int j = 0; j < n - 1; j++) {
                c[j] = c[j + 1];
            }
            c[n - 1] = first;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

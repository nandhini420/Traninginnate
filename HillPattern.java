import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HillPattern{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int n = a * 2;

        for (int i = 1; i <= n; i++) {
            if (i <= a) {
                for (int star = 1; star <= i; star++) {
                    System.out.print("*");
                }
            } else {
                for (int star = n - i + 1; star >= 1; star--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

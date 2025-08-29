import java.io.*;
import java.util.*;

public class AmoebaMultiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println(0);
            return;
        }
        if (a == 1) {
            System.out.println(0); 
            return;
        }
        if (a == 2) {
            System.out.println(1); 
            return;
        }

        int first = 0;   
        int second = 1;  
        int next = 0;
        for (int i = 3; i <= a; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(second); 
    }
}

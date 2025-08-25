import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorPrinter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.print("1");
        for (int i = 2; i <= a; i++) {
            if(a % i == 0){
                    System.out.print(","+i);
            }
        }
    }
}

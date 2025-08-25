import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitParityChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
             Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           int p =1;
           int ld;
           int copy = n;
           while(n>0){
               n = n/10;
               p =p*10;
           }
           p = p/10;
           n = copy;
           while(p>0){
               ld = n/p;
               n = n%p;
               p = p/10;
               if(ld%2 == 0)
               System.out.println(ld+"-Even");
               else
               System.out.println(ld+"-Odd");
           }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusPatternMatrix{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      
        int mid1 = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
        int mid2 = (n % 2 == 0) ? (n / 2) + 1 : mid1;


        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                if (i == mid1 || i == mid2  || j == mid1 || j == mid2 )
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
            
    }
}

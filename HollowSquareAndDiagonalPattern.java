
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HollowSquareAndDiagonalPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                   // int k = i+ j ;
                if (i == 1 || i == n  || j == 1 || j == n||i==j || i  + j == n+1)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
            
    }
} 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusPattern{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           int mid1 = n/2 + 1;
        for(int i = 1; i <= n;i++){
                for(int j = 1;j<= n;j++){
                        if(i==mid1||j==mid1)
                                System.out.print("*");
                        else
                                System.out.print(" ");
                }
              System.out.println();  
        }
    }
}

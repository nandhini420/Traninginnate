
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySumWithoutElement{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0;i<n;i++){
           sum = sum+ a[i];
        }
        for(int i = 0;i<n;i++){
           System.out.print((sum - a[i]) + " ");
        }
        
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroOneCounterArray{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zc = 0;
        int oc = 0;
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0;i < n;i++){
           if(a[i] == 0){
               zc++;
           }
            else{
                oc++;
            }
        }
        System.out.println("zc = "+zc);
        System.out.println("oc = "+oc);
        
    }
}

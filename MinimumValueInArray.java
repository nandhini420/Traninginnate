
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumValueInArray{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        int max = 0;
        int data = 0;
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
        int min = a[0];
       for(int i = 0; i < n; i++) {
    if(min > a[i]){
        min = a[i];
    }
}
        System.out.println(min);
    }
}
        

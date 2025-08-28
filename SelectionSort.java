import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SelectionSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
       int n =sc.nextInt();
       int a[] = new int[n];
       for(int i = 0;i<n;i++){
           a[i] =sc.nextInt();
       }
       for(int i =0;i<n-1;i++){
           min = a[i];
           index = i;
           for(int j= i+1;j<n;j++){
               if(a[j]<min){
                    index = j;
                   min = a[j];                   
               }
           }
           int t =a[i];
           a[i]= a[j];
           a[j]=t;
           
       }
       for(int i = 0;i<n;i++){
           System.out.println(a[i]+" ");
       }
    }
}

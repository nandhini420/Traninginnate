import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThreeArraySame{
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
          int b=sc.nextInt();
      int c=sc.nextInt();
     int []n = new int[a];
        int []m = new int[b];
        
        int []l = new int[c];

        for(int i = 0;i < a;i++){
            n[i]=sc.nextInt();
        }
     for(int i = 0;i < b;i++){
            m[i]=sc.nextInt();
        }
     for(int i = 0;i < c;i++){
            l[i]=sc.nextInt();
        }
     for(int i =0;i<a;i++){
         for(int j =0;j<b;j++){
             for(int k = 0;k<c;k++){
                 if(n[i]==m[j] && m[j]==l[k]){
                     System.out.print(n[i]+" ");
                 }
             }
         }
     }
 }
}
        

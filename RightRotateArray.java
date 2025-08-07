import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RightRotateArray{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 1;i<=k%size;i++){
            int copy = a[size-1];
            for(int j = size-1;j>=1;j--){
                a[j]=a[j-1];
            }
            a[0]=copy;
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}

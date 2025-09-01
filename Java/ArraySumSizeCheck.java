import java.io.*;
import java.util.*;

public class ArraySumSizeCheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            int sum1=0;
            int sum2=0;
            for(int i = 0;i<n;i++){
                    arr1[i]=sc.nextInt();
                     sum1 += arr1[i];
            }
            for(int i = 0;i<m;i++){
                    arr2[i]=sc.nextInt();
                     sum2 += arr2[i];
            }
            if(n == m && sum1 == sum2){
                    System.out.println("Same");
            }
            else{
                    System.out.println("Not Same");
            }
    }
}

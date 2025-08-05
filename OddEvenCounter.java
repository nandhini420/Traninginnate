import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEvenCounter{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0 ,even = 0;
        int []a = new int[n];
        for(int i = 0;i < n;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            if(a[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
            System.out.println("Odd = "+odd);
            System.out.println("Even = "+even);
    }
}

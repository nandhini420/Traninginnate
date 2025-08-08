import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  SumofevennumbersinRange{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;
        for(int i =1 ;i<=n;i++){
            if(i%2==0){
                Sum=Sum+i;
            }
        }
         System.out.println(Sum);
    }
}

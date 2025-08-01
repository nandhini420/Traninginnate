import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongNumberChecker

{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int p,sum = 0;
        while(n>0){
            int ld = n%10;
            p=1;
            for(int i = 1;i<= ld;i++){
                p=p*i;
            }
            sum=sum+p;
            n=n/10;
        }
        if(sum == copy){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}

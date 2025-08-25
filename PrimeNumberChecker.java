import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
            boolean isprime = true;
            if(n<=1){
                    isprime = false;
            }
                    else{
            for(int i=2;i<=n/2;i++){
                    if(n%i==0){
                            isprime = false;
                            break;
                    }
            }
                    }
            if(isprime){
                    System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");    
            }
    }
}

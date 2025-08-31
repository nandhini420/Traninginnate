import java.io.*;
import java.util.*;

public class StrongNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int sum =0;
            int copy = n;
            while(n!=0){
                     int fact =1;
                    int ld = n %10;
        for (int i = 1; i <= ld; i++) {
                    fact *= i;
                }
                      sum += fact;
                    n=n/10;
            }
            if(copy == sum){
                    System.out.println("Yes");
            }
            else{
                    System.out.println("No");
            }
    }
}

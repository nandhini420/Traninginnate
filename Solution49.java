import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution49 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int copy = num;
            int result = 0;
            int n = num;
            int count = 0;
                while(n >0){
                        count ++;
                        n = n/10;
                        
                }
            while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, count);
            num /= 10;
        }

        if (result == copy)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");          
    }
}

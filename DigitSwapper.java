import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitSwapper {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String str = String.valueOf(num);
            char[] digits = str.toCharArray();
           for(int i = 0; i < digits.length - 1; i += 2) {
                    char temp = digits[i];
                    digits[i]=digits[i+1];
                    digits[i+1]=temp;
                 
                    
            }
           System.out.print(new String(digits));
    }
}

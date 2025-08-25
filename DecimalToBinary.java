import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DecimalToBinary{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            StringBuilder s = new StringBuilder();
          while(n>0){
                    int r = n%2;
                    s.append(r);
                    n = n/2;
            }
            System.out.print(s.reverse());
    }
}

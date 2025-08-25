import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DecimalToBaseConverter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a=sc.nextInt();
            StringBuilder s = new StringBuilder();
          while(n>0){
                    int r = n%a;
                    s.append(r);
                    n = n/a;
            }
            System.out.print(s.reverse());
    }
}

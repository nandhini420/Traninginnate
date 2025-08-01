import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution27 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner (System.in);
         //Scanner sc =new Scanner (System.in);
        String timeString = sc.next();
        String[] t =timeString.split(":");
        int H =Integer.parseInt(t[0]);
        int M = Integer.parseInt(t[1]);
        int S =Integer.parseInt(t[2]);
        if ( H >= 0 && H<24 && M >= 0 && M<60 && S>= 0 && S < 60)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}

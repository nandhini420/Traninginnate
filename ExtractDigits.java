import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtractDigits {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count =0;
        boolean s = false;
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isDigit(c)){
                System.out.print(c);
                s = true;
            }
    }
        if( s == false){
            System.out.println("0");
        }
}
}

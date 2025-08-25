import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();
        int l = word.length();
        int n = key % l ;
        String ch = word.substring(n) + word.substring(0,n);
        System.out.println(ch);
    }
}

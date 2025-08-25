import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountUpperCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 90){
                count++;
            }
        }
        System.out.println(count);
    }
}

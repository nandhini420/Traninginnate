import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder A = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                A.append(ch);
            }
        }
        A.reverse();
        StringBuilder result = new StringBuilder();
        int j =0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                result.append(A.charAt(j));
                j++;
                    
            }
            else{
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}

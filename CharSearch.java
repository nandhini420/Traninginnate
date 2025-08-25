import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CharSearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        sc.nextLine();
        String word = sc.nextLine();
        int flag = 0;
        char target = ch.charAt(0);
        for(int i =0 ;i<word.length();i++){
            char c = word.charAt(i);
            if(c == target){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}

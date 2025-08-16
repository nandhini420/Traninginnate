import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseWords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            String words[] = sentence.split(" ");
            for(int i=words.length-1;i>=0;i--)
            {
                    System.out.print(words[i]+" ");
                    
            }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        for(int i = 2; i <= a ; i++){
            if(a%i == 0){
                count ++;
            }
        }
              System.out.print(count);
    }
}

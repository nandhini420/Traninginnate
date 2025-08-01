import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution55 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int val;
            for(int i = 1 ; i<=n;i++){
                    if(i%2==0){
                            val = 2;
                    }
                    else{
                            val =1;
                    }
                    for(int space = 1;space <= i;space++){
                            System.out.print(val);
                            val = val +2;
                    }
                         
                    System.out.println();
            }
    }
}

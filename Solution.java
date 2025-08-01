import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1 ; i<= a ;i++){
            int c = i * b;
            System.out.println(i+" * "+b+" = "+c);
        }
       
}
}

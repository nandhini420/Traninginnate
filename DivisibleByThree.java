import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.util.Scanner;

public class DivisibleByThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0) {
            System.out.println("The number is divisible by 3");
        }
        else {
            System.out.println("The number is not divisible by 3 and gives a remainder " + n%3);
        }
    }
}

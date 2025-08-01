import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.util.Scanner;

public class HiHelloPrinter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%15 == 0) {
            System.out.println("HiHello");
        } else if (n%3 == 0) {
            System.out.println("Hi");
        } else {
            System.out.println("Hello");
        }
    }
}

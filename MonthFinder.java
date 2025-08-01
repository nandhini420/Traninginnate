import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.util.Scanner;

public class MonthFinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("Invalid");
        }
    }
}

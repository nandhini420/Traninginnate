import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayNameFinder{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
            System.out.println("Sunday");
        else if (n == 1)
            System.out.println("Monday");
        else if (n == 2)
            System.out.println("Tuesday");
        else if (n == 3)
            System.out.println("Wednesday");
        else if (n == 4)
            System.out.println("Thursday");
        else if (n == 5)
            System.out.println("Friday");
        else if (n == 6)
            System.out.println("Saturday");
        else
            System.out.println("Please enter a valid number between 0 to 6");

}
}

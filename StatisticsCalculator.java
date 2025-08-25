import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == -1) break;

            if (n < min) min = n;
            if (n > max) max = n;

            sum += n;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.printf("Min = %d\n", min);
            System.out.printf("Max = %d\n", max);
            System.out.printf("Sum = %d\n", sum);
            System.out.printf("Average = %f\n", avg);
        }
    }
}

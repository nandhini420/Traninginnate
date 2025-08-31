import java.io.*;
import java.util.*;

public class TreasureBoxSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = {a, b, c};
                Arrays.sort(arr);  
                int secondLargest = arr[1];
                int g = gcd(gcd(a, b), c);
        System.out.println("The treasure is in the box which has the number " + secondLargest);
        System.out.println("The code to open the box is " + g);
    }
         public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}

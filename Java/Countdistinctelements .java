import java.io.*;
import java.util.*;

public class Countdistinctelements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
            }
            int Count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                Count++;
            }
        }

        System.out.println("There are " + Count + " distinct element in the array.");
    }
}

import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ld;
      //  long sum = 1;

        while (n > 0) {
           ld = n % 10;
            n = n / 10;
                    
        System.out.print(ld + " ");
        }
    }
}

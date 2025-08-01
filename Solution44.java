import java.util.*;

public class Solution44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long ld;
        long copy = n;
        long p=1;
        while(n>0){
            n = n/10;
            p = p * 10;
        }
        p=p/10;
        n= copy;
            while (p > 0) {
                ld = n / p;  
                n = n % p ;
                p = p/10;

                if (ld == 2 || ld == 3 || ld == 5 || ld == 7) {
                    System.out.print(ld + " ");
                }
            }
        }
    }


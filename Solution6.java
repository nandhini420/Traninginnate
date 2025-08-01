

import java.util.*;

public class Solution6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 0,rem = 0,copy = n;
        while(n> 0){
            r = n%10;
            n = n/10;
            rem = rem * 10 + r;
        }
        System.out.println(rem);
    }
}


import java.util.*;

public class Solution48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long square = n * n;
        long r = 0, ra =0,rem = 0,result = 0 , copy = n;
        while(n> 0){
            r = n%10;
            n = n/10;
            rem = rem * 10 + r;
        }
         while(square > 0){
            ra = square %10;
            square = square /10;
            result = result * 10 + ra;
        }
        long remsquare = rem * rem ;
        if(result == remsquare)
            System.out.println("Adam Number");
        else
            System.out.println("Not a adam number");
    }
}

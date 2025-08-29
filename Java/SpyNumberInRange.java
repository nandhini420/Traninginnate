import java.io.*;
import java.util.*;

public class SpyNumberInRange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int  m = sc.nextInt();
            int n = sc.nextInt();
            for (int i = m;i<= n ;i++){
                    int temp = i;
                    int sum = 0;
                    int product = 1;
                    while(temp!=0){
                            int r = temp  % 10 ;
                            sum  += r;
                            product *= r;
                            temp = temp / 10;
                    }
                    if((sum+product) == i){
                            System.out.println(i);
                    }
            }
    }
}

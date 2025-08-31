import java.util.*;

public class  NumberSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int term = 0;
        System.out.print(term);

        if (n > 1) {
            System.out.print(" " + 2);  
            term = 2;
        }

        int diff = 6;   
        int repeat = 0;

        for (int i = 2; i < n; i++) {
            term += diff;
            System.out.print(" " + term);

            repeat++;
            if (repeat == 2) {
                diff += 4;
                repeat = 0;
            }
        }
    }
}

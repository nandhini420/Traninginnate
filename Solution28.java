import java.util.*;

public class Solution28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeString = sc.next();
        String[] t = timeString.split("/");
        int d = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int y = Integer.parseInt(t[2]);

        if (y >= 1900 && y <= 9999) {
            if (m >= 1 && m <= 12) {
                if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31))
                    System.out.println("Valid");
                else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30))
                    System.out.println("Valid");
                else if (m == 2) {
                    if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
                        if (d >= 1 && d <= 29)
                            System.out.println("Valid");
                        else
                            System.out.println("Invalid");
                    } else if (d >= 1 && d <= 28)
                        System.out.println("Valid");
                    else
                        System.out.println("Invalid");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid"); // <-- Added this block
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;

public class OddEvenDigitRearranger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();

        String s = String.valueOf(n);
        char[] nums = s.toCharArray();

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i] - '0';
            if (digit % 2 == 0) {
                even.append(nums[i]);
            } else {
                odd.append(nums[i]);
            }
        }
        if (a == 1) {
            System.out.print(even.toString() + odd.toString());
        } else {
            System.out.print(odd.toString() + even.toString());
        }
    }
}

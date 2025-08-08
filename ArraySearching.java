import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySearching{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
     int []n = new int[a];
        for(int i = 0;i < a;i++){
            n[i]=sc.nextInt();
        }
        int data = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i < a;i++){
            if(n[i]==data){
                System.out.println("Found");
                flag = true;
                break;
            }
        }
        if(flag == false){
         System.out.println("Not found");
        }
    }
}

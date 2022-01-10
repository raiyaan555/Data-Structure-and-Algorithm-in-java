import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int j = 0; j < n ; j++){
                a[j] = sc.nextInt();
            }
            
             for(int j = 0; j < n ; j++){
               if ( a[j] <= 0 ){
                   counter++;
               }
            }
            if(c>=k)
                System.out.println("NO");
                else
                System.out.println("YES");
                
            
        }
    }
}

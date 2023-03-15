import java.io.*;
import java.util.*;

public class Strongnum{
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }
    public static void main(String[] args){
        int n = 55;
        int x = n;
        int sum = 0;
        while(x>0){
            int b = x%10;
            sum += factorial(b);
            x = x/10;
        }
        if(sum==n){
            System.out.println(n+" is strong number");
        }
        else{
            System.out.println(n+" is not strong number");
        }
    }
}
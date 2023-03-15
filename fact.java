import java.io.*;
import java.util.*;

public class fact{
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        else{
            return factorial(a-1)*a;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = factorial(x);
        System.out.println(y);
    }
}
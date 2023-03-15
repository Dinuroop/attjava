import java.util.*;
import java.io.*;

public class fibonacciseries{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<15; i++){
            int c = a+b;
            if(c>100){
                break;
            }
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
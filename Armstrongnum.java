import java.io.*;
import java.util.*;

public class Armstrongnum{
    public static void main(String[] args){
        for (int i=1; i<1000; i++){
            int n= i;
            int sum = 0;
            while(n>0){
                int b = n%10;
                sum = sum + (b*b*b);
                n = n/10;
            }
            if(sum == i){
                System.out.println(i+" ");
            }
        }
    }
}
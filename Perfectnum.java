import java.io.*;
import java.util.*;

public class Perfectnum{
    public static void main(String[] args) {
        for(int j=1;j<1000;j++){
            int n = j;
            int sum = 0;
            for(int i=1; i<=n/2;i++){
                if(n%i==0){
                    sum += i;
                }
            }
            if (sum==n){
                System.out.println(n+" is perfect number");
            }
        }
    }
}
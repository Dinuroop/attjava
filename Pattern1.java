import java.util.*;
import java.io.*;

public class Pattern1{
     public static void main(String[] args) {
        int n = 5;
        int k = 1;
        int m = 1; 
        Boolean eve = true;
        for(int i=0; i<n; i++){
            int c = m+2*i-1;
            for(int j=0; j<2*i+1; j++){
                if(eve==true){
                    if(j%2==0){
                    System.out.print(k);
                    k++;
                    }
                    else if(j%2==1){
                        System.out.print("*"); 
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(c);
                        c--;
                    }
                    else if(j%2==1){
                        System.out.print("*"); 
                    }
                }
            }
            eve = !eve;
            System.out.println();
        }
     }
}
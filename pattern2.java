import java.io.*;
import java.util.*;

public class pattern2{
    public static void main(String[] args) {
        int n = 4, space = 0, k =1, num =n;
        int c = 1;
        for(int i=0; i<n;i++){
            for(int j=1; j<=space; j++){
                System.out.print("-");
            }
            for(int m=1; m<2*n-space; m++){
                if(m%2==0){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(c);
                    c++;
                }
            }
            System.out.print("*");
            for(int l=1;l<2*n-space;l++){
                if(l%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(k+num*num);
                    k++;
                }
            }
            num--;
            space = space+2;
            System.out.println();
        }
    }
}
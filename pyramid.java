import java.io.*;
import java.util.*;

public class pyramid{
    public static void main(String[] args){
        int n = 6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            int c = i;
            for(int k=0;k<i+1;k++){
                System.out.print(c+1+" ");
                c++;
            }
            for(int l=0;l<i;l++){
                c--;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    } 
}
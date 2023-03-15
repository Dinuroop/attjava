import java.io.*;
import java.util.*;

public class Demo{
    public static void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            for(int l=0;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        pyramid(x);
    } 
}
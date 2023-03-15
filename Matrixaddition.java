import java.io.*;
import java.util.*;

public class Matrixaddition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c,r1,c1;
        System.out.println("Enter number of rows and columns of marix-1");
        r = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter number of rows and columns of marix-2");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int arr[][] = new int[r][c];
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r1][c1];
        if(r==r1 && c==c1){
        System.out.println("Enter the matrix-1");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the matrix-2");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Matrix sum");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }
}
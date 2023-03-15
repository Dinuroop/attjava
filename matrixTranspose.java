import java.io.*;
import java.util.*;

public class matrixTranspose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter number of rows and columns");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            System.out.print(" ");
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
import java.util.*;
import java.io.*;

public class eleinmatrix{
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 8;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==x){
                    System.out.println("Element is present in matrix in pos " + i +" , "+ j);
                }
            }
        }
    }
}
import java.io.*;
import java.util.*;

public class Interchange{
    static void interchange(int m[][]){
        int row = m.length;
        for(int i=0; i<m[0].length; i++){
            int t = m[0][i];
            m[0][i] = m[row-1][i];
            m[row-1][i] = t;
        }
    }
    public static void main(String[] args) {
        int m[][] = {{8,9,7},
                     {5,4,8},
                     {8,9,7},
                     {4,5,6}};
        interchange(m);
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
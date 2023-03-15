import java.io.*;
import java.util.*;

public class kthmissing{
    public static void main(String[] args) {
        int [] a= {2,4,6,8};
        int n = a.length;
        int x = a[n-1];
        int [] b = new int[x-n];
        int k = 0;
        for(int i=1; i<x+1; i++){
            int j;
            for(j=0; j<n; j++){
                if(i == a[j]){
                    break;
                }
            }
            if(j==n){
                b[k] = i;
                k++;
            }
        }
        System.out.println(b[2]);
    }
}
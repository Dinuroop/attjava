import java.io.*;
import java.util.*;

public class Leader{
    static void printLeaders(int arr[], int n){
        for (int i=0; i<n; i++){
            int j;
            for (j=i+1; j<n; j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if (j == n){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {5,7,8,1,3,5,4,4};
        int n = a.length;
        printLeaders(a,n);    
    }
}
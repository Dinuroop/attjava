import java.io.*;
import java.util.*;

public class SelectionSort{
    public static void selSort(int a[]){
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n;j++){
                if (a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args){
        int a[] = {25,65,42,13,11,25,78,96,33,11,2,56,48,78};
        selSort(a);
        System.out.println("Sorted Array : "+Arrays.toString(a));
    }
}
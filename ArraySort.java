import java.io.*;
import java.util.*;

public class ArraySort{
    public static void main(String[] args){
        int a[] = {25,65,48,72,31,56,12,69,87,45,63,11,25,36};
        int n = a.length/2;
        for (int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=n; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
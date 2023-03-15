import java.io.*;
import java.util.*;

public class maxele{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Elements of array");
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<x;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max ele: "+max);
    }
}
import java.io.*;
import java.util.*;

public class Binarysearch{
    public static void binary(int arr[], int key){
        int f = 0;
        int l = arr.length-1;
        while(f<=l){
            int mid = (f+l)/2;
            if (key<arr[mid]){
                l = mid-1;
            }
            else if (arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else{
                f = mid+1;
            }
        }
        if(f>l){
            System.out.println("No element"); 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Elements of array");
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        binary(arr,y);
    }
}
import java.io.*;
import java.util.*;

public class Insert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element and index number:");
        int x = sc.nextInt();
        int ind = sc.nextInt();
        for(int i=n;i>ind;i--){
            arr[i] = arr[i-1];
        }
        arr[ind] = x;
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
    }
}
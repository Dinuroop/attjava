import java.io.*;
import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        int arr[] = {1,2,5,8,9,7,4,6,3};
        int k = 5;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Elemet is at index: "+i);
                break;
            }
        }
    }
}
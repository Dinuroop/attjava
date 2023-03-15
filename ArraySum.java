import java.io.*;
import java.util.*;

public class ArraySum{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int n = a.length/2;
        int fh = 0;
        int sh = 0;
        for(int i=0; i<n; i++){
            fh += a[i];
        }
        for(int i=n; i<a.length;i++){
            sh += a[i];
        }
        System.out.println("First half: "+ fh);
        System.out.println("Second half: "+ sh);
    }
}
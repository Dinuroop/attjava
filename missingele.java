import java.io.*;
import java.util.*;

public class missingele{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,7};
        int n = a.length+1;
        int tot = n*(n+1)/2;
        for(int i=0; i<n-1;i++){
            tot = tot-a[i];
        }
        System.out.println(tot);
    }
}
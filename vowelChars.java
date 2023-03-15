import java.io.*;
import java.util.*;

public class vowelChars{
    public static void main(String[] args){
        char[] a = {'a','e','i','o','u'};
        String x = "umbrella";
        int c = 0;
        for(int i=0; i<x.length(); i++){
            for (int j=0; j<5;j++){
                if(a[j]==x.charAt(i)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
import java.util.*;
import java.io.*;

public class subString{
    public static void main(String[] args) {
        String word = "Geeks";
        int n = word.length();
        System.out.println(word);
        for(int i =1; i<n; i++){
            String s = "";
            for(int j=0; j<n-i;j++){
                s += word.charAt(j);
            }
            System.out.println(s);
        }
    }
}
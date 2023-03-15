import java.io.*;
import java.util.*;

public class ReverseText{
    public static void reverse(String a){
        String arr[] = a.split(" ");
        String reverse = "";
        for (int i=0; i<arr.length;i++){
            String r = "";
            String word = arr[i];
            for(int j = word.length()-1;j>=0;j--){
                r += word.charAt(j);
            }
            reverse += r+" ";
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        reverse(a);
    }
}
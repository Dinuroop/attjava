import java.io.*;
import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String rev = "";
        for(int i=x.length()-1;i>=0;i--){
            rev += x.charAt(i);
        }
        if(rev.equals(x)){
            System.out.println(x+" is a palindrome");
        }
        else{
            System.out.println(x+" is not a palindrome");
        }
    }
}
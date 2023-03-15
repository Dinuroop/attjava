import java.io.*;
import java.util.*;

public class Stringconcat{
    public static void StringConcat(String a, String b){
        String c;
        c = a + " " + b;
        System.out.println(c);
    }
    public static void main(String[] args){
        String a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        a = sc.nextLine();
        b = sc.nextLine();
        System.out.println(a+" "+b);
        String words[] = a.split(" ");
        System.out.println(words[0].reverse());
        StringConcat(a,b);
    }
}
import java.util.*;
import java.io.*;

public class mulOften{
    public static void main(String[] args) {
        int n = 267;
        int u = n%10;
        int rem = n/10;
        int res;
        if(u>=5){
            res = rem*10+10;
        }
        else{
            res = rem*10;
        }
        System.out.println(res);
    }
}
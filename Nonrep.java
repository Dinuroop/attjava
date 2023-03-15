import java.util.*;
import java.io.*;

public class Nonrep{
    public static void main(String[] args) {
        String str = "Dinu";
        char string[] = str.toCharArray();

        for(int i=0; i<string.length; i++){
            int j;
            for(j=i+1; j<string.length; j++){
                if(string[i] == string[j]){
                    break;
                }
            }
            if(j==string.length){
                System.out.println(string[i]);
                break;
            }
        }
    }
}
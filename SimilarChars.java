import java.util.*;
import java.io.*;

class SimilarChars{
    static void similar(String a, String b){
        char [] max = new char[256];
        for(int i=0; i<b.length(); i++){
            max[b.charAt(i)]++;
        }
        for(int j=0; j<a.length(); j++){
            if(max[a.charAt(j)]==0){
                System.out.print(a.charAt(j));
                
            }
        }

    }
    public static void main(String[] args) {
        String str1 = "the quick brown fox";
        String str2 = "queen";
        similar(str1,str2);
    }
}
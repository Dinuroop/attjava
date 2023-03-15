import java.util.*;

public class SubStrings{
    static void printstr(String str, int low, int high){
        for(int i = low; i<=high; i++){
            System.out.print(str.charAt(i));
        }
    }
    static int longestSubString(String str){
        int n = str.length();
        int maxLength = 1, start= 0;
        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                int flag = 1;
                for(int k=0; k<(j-i+1); k++ ){
                    if(str.charAt(i+k) != str.charAt(j-k)){
                        flag = 0;
                    }
                }
                if (flag!=0 && j-i+1>maxLength){
                    start = i;
                    maxLength = j-i+1;
                }
            }
        }
        System.out.print("Longest SubString: ");
        printstr(str, start, maxLength+start-1);
        System.out.println();
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "aabaabbaa";
        System.out.println(longestSubString(str));
    }
}
import java.io.*;
import java.util.*;

public class Rightpy { 	    
    public static void rightTriangle(int n)   { 	        
        for(int i=0;i<n;i++){
            System.out.print(" ");
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
	    public static void main(String args[]) { 
	        int n = 5; 
	        rightTriangle(n); 
	    } 
}

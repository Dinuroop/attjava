import java.util.*;

public class Celebrity{
    static int Matrix[][] = {{0,0,1,0},
                            {0,0,1,0},
                            {0,0,0,0},
                            {0,0,1,0}};
    static int knows(int a, int b){ return Matrix[a][b];}
    static int findCeleb(int n){
        int indeg[] = new int[n];
        int outdeg[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x = knows(i,j);

                indeg[j] += x;
                outdeg[i] += x;
            }
        }
        // System.out.println(Arrays.toString(indeg));
        // System.out.println(Arrays.toString(outdeg));
        for(int i=0; i<n; i++)
            if(indeg[i]==n-1 && outdeg[i]==0)
                return i;
        return -1; 
    }
    public static void main(String[] args) {
        int n = 4;
        int id = findCeleb(n);
        if(id == -1){
            System.out.println("No such celeb");
        }else{
            System.out.println("Celeb id: "+id);
        }
    }
}
public class Patternnums{
    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i<n; i++){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            int c = i+1;
            for(int k=0; k<n-i; k++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        for(int i=2; i<n+1; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            int c = n-i+1;
            for(int k=i; k>0; k--){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        
    }
}
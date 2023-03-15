
public class Majority{
    static void majority(int a[], int n){
        int maxCount = 0;
        int ind = -1;
        for(int i=0; i<n; i++){
            int c = 1;
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c>maxCount){
                maxCount = c;
                ind = i;
            }
        }
        if(maxCount>n/2){
            System.out.println("Majority : "+a[ind]);
        }
        else{
            System.out.println("No such element");
        }
    }
    public static void main(String[] args) {
        int a [] = {5,7,5,5,6,3,5,5,7,5};
        int n = a.length;
        majority(a,n);
    }
}
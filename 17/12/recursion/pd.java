import java.util.Scanner;

public class pd {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        pda(n);
    }

    public static void pda(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        
        pda(n-1);
        
        
        
    }

}
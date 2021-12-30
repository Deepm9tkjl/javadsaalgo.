
import java.io.*;
import java.util.*;

public class fact {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int fact=fctn(n);
        System.out.println(fact);
        
        
    }

    public static int fctn(int n){
        if(n==0){
        return 1;
            
        }
        int fm1=fctn(n-1);
        return n*fm1;
    }

}
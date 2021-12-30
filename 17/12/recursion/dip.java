import java.io.*;
import java.util.*;

public class dip {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ipd(n);
    }

    public static void ipd(int n){
        if(n==0){
            return;
            
        }
       
        System.out.println(n);
         ipd(n-1);
        System.out.println(n);
    }

}
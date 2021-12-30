//package string;

import java.io.*;
import java.util.*;

public class inpp {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ip(n);
    }

    public static void ip(int n){
        if(n==0){
            return;
            
        }
        ip(n-1);
        System.out.println(n);
        
    }

}
import java.io.*;
import java.util.*;

public class lipwr {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int p=pwr(x,n);
        System.out.println(p);
    }

    public static int pwr(int x, int n){
        if(n==0){
        return 1;}
        int pp=pwr(x,n-1);
        int xn=x*pp;
        return xn;
    }

}
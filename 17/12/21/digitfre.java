import java.util.*;

import java.io.*;
public class digitfre {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
       int  count=0;
        while(n>0){
            int rv=n%10;
            if(rv==d){
                count++;
            }
            n=n/10;
        }
        return count;
        // write code here
    }
}
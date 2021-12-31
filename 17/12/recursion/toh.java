
import java.io.*;
import java.util.*;

public class toh {

  public static void main(String[] args) throws Exception {
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    int a=scn.nextInt();
    
    int b=scn.nextInt();
    int c=scn.nextInt();
    toh(n,a,b,c);
  }public static void toh(int n,int a, int b,int c){
      if(n==0){
          return;
      }
      toh(n-1,a,c,b);
      System.out.println(n + "[" + a + " -> " + b + "]");
      toh(n, c, b, a);
  }
   

                        
  }
import java.util.*;
import java.io.*;  
  public class dab{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int p=1;
       int dab=0;
       while(n>0){
           int dig=n%b;
           n=n/b;
           dab=dab+dig*p;
           p=p*10;
       }
    return dab;
   }
  }
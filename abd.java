import java.util.Scanner;
  
  public class abd{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int p=1,abd=0;
      while(n>0){
          int dig=n%10;
          n=n/10;
          abd=abd+dig*p;
          p=p*b;
      
      }
      return abd;
   }
  }
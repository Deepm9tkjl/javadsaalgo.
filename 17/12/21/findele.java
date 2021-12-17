import java.util.Scanner;

public class findele{

public static void main(String[] args) {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    int f=scn.nextInt();
     int idx=-1;
     for(int i=0;i<arr.length;i++){
         if(arr[i]==f){
             idx=i;
         }
     }
     System.out.println(idx);
 }

}
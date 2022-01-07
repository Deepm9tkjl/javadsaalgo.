import java.io.*;
import java.util.*;

public class mul{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int r1=scn.nextInt();
    int c1=scn.nextInt();
    int[][] one=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            one[i][j]=scn.nextInt();
            
        }
    }
    int r2=scn.nextInt();
    int c2=scn.nextInt();
    int[][] two=new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            two[i][j]=scn.nextInt();
            
        }
    }
    if(c1 != r2){
        System.out.println("Invalid input");
        return ;
    }
    int[][] mul=new int[r1][c2];
    for(int i=0;i<mul.length;i++){
        for(int j=0; j<mul[0].length;j++){
            
            for(int k=0;k<c1;k++){
                mul[i][j] +=one[i][k]*two[k][j];
            }
            
        }
    }
       for(int i=0;i<r1;i++){
        for(int j=0; j<c2;j++){
        
            System.out.print(mul[i][j] +" ");
        }
           System.out.println();
       }    
    
 }

}
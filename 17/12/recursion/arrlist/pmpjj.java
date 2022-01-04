import java.io.*;
	import java.util.*;

	public class pmpjj {


        public static void main(String[] args) throws Exception {

	    
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
  printMazePaths(0, 0, n - 1, m - 1, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc){
            return;
        }

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

       for(int k=1;sc+k<=dc;k++){
         printMazePaths(sr,sc+k,dr,dc,psf +'h' +k);  
       }
       
       for(int k=1;sr+k<=dr;k++){
         printMazePaths(sr+k,sc,dr,dc,psf +'v' +k);  
       }
       
       for(int k=1;sc+k<=dc&&sr+k<=dr;k++){
         printMazePaths(sr+k,sc+k,dr,dc,psf +'d' +k);  
       }
        
    }
}


                        
                                
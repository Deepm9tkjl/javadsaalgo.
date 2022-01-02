import java.io.*;
import java.util.*;

public class strpth {

    public static void main(String[] args) throws Exception {
        Scanner  scn =new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> paths=getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres=new ArrayList<>();
            
            return bres;
        }
        ArrayList<String> pth1=getStairPaths(n-1);
                ArrayList<String> pth2=getStairPaths(n-2);
                        ArrayList<String> pth3=getStairPaths(n-3);
                        ArrayList<String> pths=new ArrayList<>();
                        
                        for(String pt:pth1){
                            pths.add(1+pt);
                        }
                        
                        for(String pt:pth2){
                            pths.add(2+pt);
                        }
                        
                        for(String pt:pth3){
                            pths.add(3+pt);
                        }
        return pths;
    }

}
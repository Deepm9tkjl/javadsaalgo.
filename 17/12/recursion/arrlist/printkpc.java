import java.io.*;
import java.util.*;

public class printkpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String  str=scn.next();
        printKPC(str,"");

    }
static  String[] codes={".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
         char ch=str.charAt(0);
         String ros=str.substring(1);
          for(char chcode: codes[ch - 48].toCharArray()){
            printKPC(ros, asf + chcode);
        }
         //String codfrc=codes[ch-'0'];
        //  for(int i=0; i<codfrc.length();i++){
        //      char cho=codefrc.charAt(i);
        //      printKPC(ros,asf+cho);
        //  }
        
    }

}
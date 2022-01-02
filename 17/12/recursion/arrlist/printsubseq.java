// import java.util.*;
// import java.io.*;
// public class printsubseq {
// public static void main(String[] args){
//     ArrayList<Integer> list= new ArrayList<>();
//     list.add(12);
//     list.add(13);
//     System.out.println(list + "->" +list.size());
//     // for(int val  : list){
//     //     System.out.println(val);
//     // }
//     //get se value  nikalte hai
//     for( int i=0; i<list.size(); i++){
//         int val=list.get(i);
//         System.out.println(val);
//     }
//     //set se value replace kar deta
//     list.set(1,14);
//     list.add(0,45);
//     System.out.println(list + "->" +list.size());
// }
    
// }
import java.io.*;
import java.util.*;

public class printsubseq {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
String str=scn.next();
ArrayList<String> res=gss(str);
        System.out.println(res);
        
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);//a
        String ros=str.substring(1);//b
        ArrayList<String> rres=gss(ros);
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:rres){
            mres.add(""+rstr);
           
        }
          for(String rstr:rres){
            
            mres.add(ch +rstr);
        }
        return mres;
    }

}


package Java_Coding_ques;
import java.util.*;

public class StringRev {
    
    public static void main(String[] args) {
        Scanner scan=null;
        try{
         scan=new Scanner(System.in);
         String str=scan.nextLine();
         byte[] StrtoArray =str.getBytes();
         byte[] result =new byte[StrtoArray.length];
         for (int i=0;i<StrtoArray.length;i++){
             result[i]=StrtoArray[StrtoArray.length-i-1];
         }
         System.out.println(new String(result));
        }
        finally{
            scan.close();
        }
    }
}

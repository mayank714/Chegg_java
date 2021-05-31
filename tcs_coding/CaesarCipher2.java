package tcs_coding;

import java.util.*;
public class CaesarCipher2 {
    public static String Caesar(String plaintext,int shift){
        
        if(shift>26){
            shift=shift%26;
        }
        else if(shift<0){
            shift=(shift%26)+26;
        }
        String CaesarText="";
        int length=plaintext.length();
        for(int i=0;i<length;i++){
            char ch=plaintext.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    char c=(char)(ch+shift);
                    if(ch>'Z'){
                        CaesarText+=(char)(ch-26-shift);
                    }
                    else{
                        CaesarText+=c;
                    }
                }
                else if (Character.isLowerCase(ch)){
                    char c=(char)(ch+shift);
                    if(ch>'z'){
                        CaesarText+=(char)(ch-26-shift);
                    }
                    else{
                        CaesarText+=c;
                    }
                }

            }
            else{
                CaesarText+=ch;
            }
        }
        return CaesarText;
    }
    public static void main(String args[]){
        Scanner scan=null;
        try{
            scan=new Scanner (System.in);
            String PlainText=scan.nextLine();
            int shift=scan.nextInt();
            String result=Caesar(PlainText, shift);
            System.out.println(result);
        }
        finally{
            scan.close();
        }
    }
}

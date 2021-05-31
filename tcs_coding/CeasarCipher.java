package tcs_coding;
import java.util.*;

public class CeasarCipher {
    public static String Encrypt(String Plaintext, int shift){
        if(shift>26){
            shift=shift%26;
        }
        else if (shift<0){
            shift=(shift%26)+26;
        }
        String CipherText="";
        int length = Plaintext.length();
        for (int i=0;i<length;i++){
            char ch =Plaintext.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    char c= (char)(ch+shift);
                    if(ch>'Z'){
                        CipherText+=(char)(ch-(26-shift ));
                    }
                    else{
                        CipherText+=c;
                    }
                }
                else if(Character.isLowerCase(ch)){
                    char c= (char)(ch+shift);
                    if(ch>'z'){
                        CipherText+=(char)(ch-(26-shift));
                    }
                    else{
                        CipherText+=c;
                    }
                }
            }
            else{
              CipherText+=ch;  
            }
        }
        
        return CipherText;
    }
    // public static String Decrypt(String Plaintext, int shift){
    //     if(shift>26){
    //         shift=shift%26;
    //     }
    //     else if (shift<0){
    //         shift=(shift%26)+26;
    //     }
    //     String CipherText="";
    //     int length = Plaintext.length();
    //     for (int i=0;i<length;i++){
    //         char ch =Plaintext.charAt(i);
    //         if(Character.isLetter(ch)){
    //             if(Character.isUpperCase(ch)){
    //                 char c= (char)(ch-shift);
    //                 if(ch<'A'){
    //                     CipherText+=(char)(ch+(26-shift ));
    //                 }
    //                 else{
    //                     CipherText+=c;
    //                 }
    //             }
    //             else if(Character.isLowerCase(ch)){
    //                 char c= (char)(ch-shift);
    //                 if(ch<'a'){
    //                     CipherText+=(char)(ch+(26-shift));
    //                 }
    //                 else{
    //                     CipherText+=c;
    //                 }
    //             }
    //         }
    //         else{
    //           CipherText+=ch;  
    //         }
    //     }
        
    //     return CipherText;
    // }
    public static void main(String args[]){
        Scanner scan = null;
        try{
            scan= new Scanner(System.in);
            System.out.println("Enter your Plain Text : ");String text = scan.nextLine();
            
            System.out.println("Enter the Key : ");
            int shifter=scan.nextInt();
            String Cipher=Encrypt(text, shifter);
            System.out.println(Cipher);
        }
        finally{scan.close();}
    }
}

import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner scan = null;
        try{
            scan = new Scanner (System.in);
            String s1= scan.nextLine();
            String s2=scan.nextLine();
            String s3=scan.nextLine();
            int len1= s1.length();
            int len2= s2.length();
            String str1="",str2="",str3="";
            char c;
            for(int i=0;i<len1;i++){
                c=s1.charAt(i);
                if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'){
                    str1=str1+"%";
                }
                else
                str1=str1+c;

            }
            for(int i=0;i<len2;i++){
                c=s2.charAt(i);
                if((c>='A' && c<='Z')||(c>='a' && c<='z')){
                    if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||
                    c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'){
                        str2=str2+c;
                    }
                    else
                    str2=str2+"#";
                }

            }
            str3=s3.toUpperCase();
            System.out.println(str1+str2+str3);

        }
        finally{
            scan.close();
        }
    }
}


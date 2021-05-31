package tcs_coding;

import java.util.*;
public class Alexa {
    public static Integer Alex(int n1,int n2){
        
        int num=0;
        return num;
    }
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            int n1=scan.nextInt();
            int n2=scan.nextInt();
            int output=Alex(n1, n2);
            if(output>=n1 && output<=n2){
                System.out.println(output);
            }
            else{
                System.out.println("Wrong Rangeeee!!");
            }
            
        }
        finally{
            scan.close();
        }
        
    }
    
}

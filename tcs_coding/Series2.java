package tcs_coding;

import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        Scanner scan = null;
        try{
            scan = new Scanner(System.in);
            int n=scan.nextInt();
            int a=1,b=1;
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    if(i==1){
                      a=1;  
                    }
                    else{
                        a=a*2;
                    }

                }
                else{
                    if(i==1){
                        b=1;
                    }
                    else{
                        b=b*3;
                    }

                }
            }
            if(n%2!=0){
                System.out.println("the "+n+" term is = "+a);
            }
            else{
                System.out.println("the "+n+" term is = "+b);
            }

        }
        finally{
            scan.close();
        }
        
    }
}

package tcs_coding;

import java.util.*;
public class Doctor {
public static void main(String[] args) {
    Scanner scan=null;
    try{
        scan=new Scanner (System.in);
        int[] age = new int[20];
        int total=0;
        // int k=scan.nextInt();
        for(int i=0;i<20;i++){
            // if(age[i]==0){
            //     break;
            // }
            if(age[i]>120){
                System.out.println("INVALID!!!!!");
            }
            else 
            age[i]=scan.nextInt();

        }
        // for(int i=0;i<age.length;i++){
        //     int Intialpay=0,VariPay=0,AdultPay=0;
        //     if(age[i]<17){
        //         Intialpay +=200;
        //     }
        //   else if((age[i]>=17) &&(age[i]<=40)){
        //         VariPay +=400;
        //     }
        //     else if(age[i]>40){
        //         VariPay +=300;
        //     }
        //     total=Intialpay+VariPay+AdultPay;
        // }
        // System.out.println(total);
        

    
}
finally{
    scan.close();
}
}    
}

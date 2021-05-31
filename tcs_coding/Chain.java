package tcs_coding;

import java.util.*;
public class Chain {
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner (System.in);
            String a=scan.nextLine();
            String b=scan.nextLine();
            if(b.matches("Y" ) || b.matches("y")){
                String c=scan.nextLine();
                String[] arrSplit =c.split(",");
                int len=arrSplit.length;
                int Amount =5000;
                double ParentAmount =(len*0.1)*Amount;
                double ChildAmount =0.05*Amount;
                System.out.println("Total Members:"+(1+len));
                System.out.println("Commision details");
                System.out.println(a+":" +ParentAmount+" INR");
                for(int i=0;i<len;i++){
                    System.out.println(arrSplit[i].trim()+":" +ChildAmount+" INR");
                }
            }
             else if(b.matches("N" ) || b.matches("n")){
                System.out.println("Total Members:1");
                System.out.println("Commision details");
                System.out.println(a+"0 INR");
            }
            else
            System.out.println("Invalidd!!!!!!!!!!!!");
        }
        finally{
            scan.close();
        }
    }
}

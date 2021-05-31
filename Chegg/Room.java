package Chegg;
import java.util.*;
public class Room {
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner (System.in);
            // int *p;
            System.out.println("Enter no of Beds :");
            int bed=scan.nextInt();
            if(bed==1 || bed==2 || bed==3.5){
            System.out.println("How many Room? ");
            int room =scan.nextInt();
            double p1=150.0;
            double p2=300.00;
            double p3=450.00;
            if(bed==1){
                System.out.println(room+ " Single the total is "+p1*room);
            }
            else if(bed==2){
                System.out.println(room+ " Double the total is "+p2*room);
            }
            else if(bed==3.5){
                System.out.println(room+ " Family the total is "+p3*room);
            }
            }
            else{
                System.out.println("No Room available ");
            }
            int a=3;
            int b=6;
            int c= a | b;
            System.out.println(c);
            int d= a&b;
            System.out.println(d);
            // System.out.println();
             
        }
        finally{
            scan.close();
        }
    }
}

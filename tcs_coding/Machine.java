package tcs_coding;
import java.util.*;
public class Machine {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0 && n<=2000){
            System.out.println("Time Estimated : 25 Minute");
        }
       else if(n>2000 && n<=4000){
            System.out.println("Time Estimated : 35 Minute");
        }
        else if(n>4000 && n<=7000){
            System.out.println("Time Estimated : 45 Minute");
        }
        else
        System.out.println("Invalid input !!!!!!!");
    }
}

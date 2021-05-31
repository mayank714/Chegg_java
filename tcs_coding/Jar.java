package tcs_coding;
import java.util.*;
public class Jar {
    public static void main(String[] args) {
        Scanner scan = null;
        try{
            scan = new Scanner (System.in);
            int CandyValue=scan.nextInt();
            int n=10,k=5;

            // System.out.println("Number of candy sold : "+CandyValue);
            if(CandyValue>1 && CandyValue<=k){
                System.out.println("Number of candy SOld : "+CandyValue);
                System.out.println("Number of Candy Available : "+(n-CandyValue));

            }
            // else if(CandyValue==0){
            //     System.out.println("Invalid Input");
            // }
            else{
            System.out.println("Invalid Input");
            System.out.println("Number of Candy Left "+n);
        }
        }
        finally{
            scan.close();
        }
    }
}

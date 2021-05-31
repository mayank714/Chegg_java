package tcs_coding;
import java.util.*;


public class Marix {
 public static void main(String args[]){
     Scanner scan = null;
     try{
         scan=new Scanner(System.in);
         System.out.println("Enter the number of row");
         int m=scan.nextInt();
         System.out.println("Enter the number of column");
         int n=scan.nextInt();
         int first[][]= new int[m][n];
         int temp=0,max=1;
         int sum[]=new int[100];

         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 first[i][j]= scan.nextInt();
             }
         }
         for(int i=0;i<m;i++){
             sum[i]=0;
            for(int j=0;j<n;j++){
               sum[i]=sum[i]+first[i][j];
                
            }
        }
        for(int i=0;i<m;i++){
            System.out.println("The sum of Row:"+ i+1 +" is :" +sum[i]);
        }

    for(int i=0;i<m;i++){
        if(sum[0]<sum[i+1]){ 
            //checking if sum[0] is greater then sum[i+1] or not , if not then
            temp=sum[0];
            // Temp was initially empty , We assign the first value of first row to temp.
            sum[0]=sum[i+1];
            // Now we have increase the sum value of 1 , That means we are now aceessing the second row value.
            sum[i+1]=temp;
            //we have assign the second row value to the temp.
            max=max+1;
            // if the counter increases then we increase the max value by 1.
        }

    }
    System.out.println("the Row"+max+" has the largest sum : "+sum[0]);     
     }
     finally{
     scan.close();}
 }
    
}

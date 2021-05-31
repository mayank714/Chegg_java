package Chegg;
import java.util.*;
// import java.util.Arrays;

public class Robot{
    public static void main(String[] args) {
        Scanner scan =null;
        try{
            scan= new Scanner (System.in);
            int count =1;
            int [] arr= new int [20];
            System.out.println("Enter the permanent element of the stack");
            arr[0]=scan.nextInt();
            System.out.println("Enter the number of block you want to insert");
            int length= scan.nextInt();
            for(int i=0;i<length;i++){
                arr[i+1]=scan.nextInt();
                count++;
            }
            
            for(int i=0;i<count;i++){
                System.out.println(arr[i]);
            }
        }
        finally{
            scan.close();
        }
    }
}
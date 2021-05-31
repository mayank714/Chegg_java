package tcs_coding;
import java.util.*;
public class Even {
public static void main(String[] args) {
    Scanner scan=null;
    try{
        scan=new Scanner (System.in);
        int num=scan.nextInt();
        int Total=0;
        int count=0;
        int[] Arr=new int [200];
        // int range =
        for(int i=0;i<num;i++){
            if(i%2==0){
                
                Arr[count]=i;
                count++;
            }
            else{
                continue;
            }
        }
        for(int i=0;i<=count;i++){
            Total+=Arr[i];
        }
        // int Arrlen= Arr.length;
        System.out.println(count);
        System.out.println("Result : "+(Arr[1]+Arr[count-1]));
        System.out.println(Total);
        // System.out.println(21/10);
        // System.out.println(21%10);
    }
    finally{
        scan.close();
    }
}
    
}

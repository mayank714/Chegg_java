package tcs_coding;
import java.util.*;

public class ArrayofEven {
    public static void main(String[] args) {
        Scanner scan =null;
        try{
            scan=new Scanner (System.in);
            int num=scan.nextInt();
            int count=0;
            int result=0;
            int[] Arr=new int[20];
            for(int i=0;i<=num;i++){
                // int count=0;
                if(i%2==0){
                    Arr[count]=i;
                    count++;
                }
                else
                continue;
            }
            // syso("")
            System.out.println("The elements of the array are");
            for (int i=1;i<count;i++){
                result+=Arr[i];
                // System.out.println("The result is : "+result);
                System.out.println(Arr[i]);
            }
            System.out.println("The result is : "+result);

        }
        finally{
            scan.close();
        }
    }
}

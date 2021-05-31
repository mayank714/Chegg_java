package tcs_coding;
import java.util.*;
public class Infosys {
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            int[] arr=new int[20];
            int count=0;
            // int[] arr1=new int[20];
            int num=scan.nextInt();
            for(int i=2;i<=(num*2);i++){
                
                if(((i%2!=0)||(i==2))&&
                ((i%3!=0)||(i==3))&&
                (i%4!=0)&&
                ((i%5!=0)||(i==5))&&
                (i%6!=0)&&
                ((i%7!=0)||(i==7))&&
                (i%8!=0)&&(i%9!=0)){
                    // arr[count]=i;
                    //         count++;
                    int temp,digit,counter=0;
                    temp=i;
                    while(i>0) {
                        i = i / 10;
                        counter++;
                    }
                    while(temp > 0)
        {
            digit = temp % 10;
            // System.out.println("Digit at place "+counter+" is: "+digit);
            if((digit!=1) &&(digit!=4) &&(digit!=6) &&(digit!=8) &&(digit!=9)){
                temp = temp / 10;
                counter--;
            }
            else{
                break;
            }
            
        }
                    
                    // String number = String.valueOf(i);
                    // for(int k = 0; i < number.length(); k++) {
                    //     int j = Character.digit(number.charAt(k), 10);
                    //     // System.out.println("digit: " + j);
                    //     if((j!=0 )&&(j!=1) &&(j!=4)&&(j!=6) &&(j!=8)&&(j!=4)){
                            
                    //     }
                        // else{
                        //     continue;
                        // }
                    
                }
                else
                {
                    continue;
                }
            }
            for(int i=0;i<=count;i++){
                System.out.println(arr[i]);
            }
        }
        finally{
            scan.close();
        }
    }
}

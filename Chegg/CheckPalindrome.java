package Chegg;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan=null; 
        try{
        scan=new Scanner (System.in);
        int a=scan.nextInt();
        // System.out.println(b);
        int temp=a;
        int sum=0;
        while(a>0){
            int b=a%10;
           
            sum=(10*sum)+b;
            a=a/10;
        }
        if(temp==sum){
            System.out.println("Yes it is a palindrome");
        }
        else
        System.out.println("No.......Its is not a palindrome");
        System.out.println(sum);
    }
    finally{
        scan.close();
    }
}
    
    
}

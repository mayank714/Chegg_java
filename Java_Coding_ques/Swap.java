package Java_Coding_ques;

import java.util.Scanner;

public class Swap {
    public static Integer Factorial(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            int num=scan.nextInt();
            int result=Factorial(num);
            System.out.println("The Factorial is : "+result);
        }
        finally{
            scan.close();
        }
    }
    
}

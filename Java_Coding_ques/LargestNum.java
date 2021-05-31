package Java_Coding_ques;
import java.util.Scanner;
import java.io.IOException;
public class LargestNum {
    void input() throws IOException{
        System.out.println("Please enter the first number");
        
        Scanner inp1 = new Scanner(System.in);
        // try{
        int input1 = inp1.nextInt();
        System.out.println("Please enter the Second number");
        Scanner inp2 = new Scanner(System.in);
        int input2 = inp2.nextInt();
        System.out.println("Please enter the Third number");
        Scanner inp3 = new Scanner(System.in);
        int input3 = inp3.nextInt();
        System.out.println("Your Entered numbers are \n"+input1+"\n"+input2+"\n"+input3);
        
        
        
         if (input1 >= input2){
            if (input1 >= input3){
                System.out.println(input1+" is the largest Number");
            }
            else
            System.out.println(input1+ " is not a largest number");
         }

         if (input2 >= input1){
            if (input2 >= input3){
                System.out.println(input2+" is the largest Number");
            }
            else
            System.out.println(input2+ " is not a largest number");
         }

         if (input3 >= input1){
            if (input3 >= input1){
                System.out.println(input3+" is the largest Number");
            }
            else
            System.out.println(input3+ " is not a largest number");
         }
        // }
        // finally{
        //     inp1.close;
        // }
    }

public static void main(String[] args)throws IOException {
    LargestNum obj = new LargestNum() ;
    obj.input();
}
}
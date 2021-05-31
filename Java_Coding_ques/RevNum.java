package Java_Coding_ques;
import java.util.Scanner;

public class RevNum {
    void main (){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int input = inp.nextInt();
        int sum=0;
        int temp=input;
        int n;
        while(input >0){
            n = input %10;
            sum=(sum*10)+n;
            input = input /10;

        }
        if (sum==temp){
            System.out.println("the "+sum+" is a palindrome");
        }
         else if(sum != temp){
        System.out.println("the "+sum+" is not a palindrome");
    }
    else
    System.out.println("Enter the valid Number");
}
    public static void main(String[] args) {
        RevNum obj = new RevNum();  
        obj.main();
    }
}

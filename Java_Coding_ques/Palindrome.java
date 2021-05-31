 package Java_Coding_ques;
import java.util.Scanner;
public class Palindrome {
    void main(){
        Scanner inp = new Scanner(System.in);
        try{
        System.out.println("Enter the number you want to check");
        int input = inp.nextInt();
        System.out.println("You have entered"+input);
        int temp;
        temp= input;

        // System.out.println(temp);
        int sum=0;
        int r;
        while(input>0){
           
            r=input%10;
            sum=(sum*10)+r;
            input=input/10;

        }
        if(sum==temp){
            System.out.println("Yes "+temp+" is a palindrome");
        }
        else
        System.out.println("Sorry "+temp+" is not a palindrome");
    }
    finally{
        inp.close();
    }
    }
   public static void main(String[] args) {
      Palindrome obj = new Palindrome();
      obj.main();
   }
}
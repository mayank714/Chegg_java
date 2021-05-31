package Java_Coding_ques;

import java.util.Scanner;
public class EvenorOdd {
    void input (){
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter the number you want ot test");
        int Input1 = inp1.nextInt();
        if (Input1 % 2==0){
            System.out.println("The number is even");
        }
        else 
        System.out.println(" The number is odd");
    }
    public static void main(String[] args) {
        EvenorOdd obj = new EvenorOdd();
        obj.input();
    }
}

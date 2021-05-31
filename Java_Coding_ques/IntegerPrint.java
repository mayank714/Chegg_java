package Java_Coding_ques;
import java.util.Scanner;

// import jdk.internal.module.SystemModuleFinders;

public class IntegerPrint {
    void Integerr(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = input.nextInt();
        System.out.println("The value entered by useer is :"+num);
    }
    public static void main(String[] args) {
        IntegerPrint obj = new IntegerPrint();
        obj.Integerr();
    }
    
}

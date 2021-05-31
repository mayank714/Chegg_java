package Java_Coding_ques;
import java.util.Scanner;

public class ComplexAddition {
    void main(){
        //Scanner working
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter the first number (non imaginary)");
        Scanner inp1 =new Scanner(System.in);
        System.out.println("Enter the first number (imaginary)");
        Scanner inp2 =new Scanner(System.in);
        System.out.println("Enter the Second number (non imaginary)");
        Scanner inp3 =new Scanner(System.in);
        System.out.println("Enter the Second number (imaginary)");
        //Assigning the scanner
        double input1 = inp.nextDouble();
        double input2 = inp1.nextDouble();
        double input3 = inp2.nextDouble();
        double input4 = inp3.nextDouble();
        // double Comp1 =input1 +(input2);
     System.out.println("Your first complex number is "+input1+"+"+input2+"i");
     System.out.println("Your first complex number is "+input3+"+"+input4+"i");
     System.out.println("Your complex number is "+input1+input3"+input2+"i");

    }
    public static void main(String[] args) {
        ComplexAddition obj = new ComplexAddition();
        obj .main();
    }
}

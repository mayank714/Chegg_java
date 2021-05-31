package Java_Coding_ques;
import java.util.Scanner;
public class Factorial {
    
        void main(){
            Scanner inp = new Scanner(System.in);
            try{
            System.out.println("Enter the number to get factorial");
            int input = inp.nextInt();
            System.out.println("You have entered \n"+input);
            long factorial = 1;
            for( int i= 1  ; i<=input ; ++i){
                factorial *= i;

            }
            System.out.println("The Factoial of "+input+"="+factorial);

        }
        finally{
            inp.close();
        }
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.main();
    }
}

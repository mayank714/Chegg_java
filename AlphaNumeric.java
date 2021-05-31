import java.util.Scanner;
public class AlphaNumeric {
    void main(){
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
    
            if(a.matches("[0-9]+")){
                System.out.println("It is a integer");
            }
            else if( a.matches("[a-zA-z]+")){
                System.out.println("It is a string");
            }
            else if( a.matches("[a-zA-z0-9]+")){
            System.out.println("It is alphanumeric");
            }
            else
            System.out.println("Please enter the valid format");
        scan.close();
    }
    public static void main(String[] args) {
        AlphaNumeric obj = new AlphaNumeric();
        obj.main();
    }
}

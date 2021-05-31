public class IfElse {
    public static void main(String[] args) {
        int Age = 80;
        int Height = 2;
        if (Age > 56 && Height > 5){
            System.out.println("The person is old and tall");
        }
        else if (Age <= 56 && Height <= 5 ){
            System.out.println("The person is younger and short");
        }
        // else if (Age < 56 || Height < 5 ){
        //     System.out.println("either The person is younger or short");
        // }
        else if (Age > 56 || Height > 5 ){
            System.out.println("either The person is old or tall");
        }
        else if (Age > 56 || Height < 5 ){
            System.out.println("either The person is old or short");
        }
        else if (Age < 56 || Height > 5 ){
            System.out.println("either The person is young or tall");
        }
        else {
            System.out.println("Enter the valid data");
        }
    }
}

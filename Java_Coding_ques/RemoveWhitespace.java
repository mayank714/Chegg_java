package Java_Coding_ques;
    import java.util.Scanner;
public class RemoveWhitespace {
    void main(){
    Scanner inp= new Scanner(System.in);
        System.out.println("Enter the string");
        String input = inp.nextLine();
        input= input.replaceAll("\\s", "");
        System.out.println("After replacement "+input);
}
public static void main(String[] args) {
    RemoveWhitespace obj = new RemoveWhitespace();
    obj . main();
}
}

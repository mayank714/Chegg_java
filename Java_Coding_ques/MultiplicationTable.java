package Java_Coding_ques;

import java.util.Scanner;
public class MultiplicationTable {
   void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type the No. for which you want to print the table");
        int inp = input.nextInt();
        for (int i=1; i<=10 ; ++i ){
        //    int result = i * input;
            System.out.println(inp+" X "+i+" = "+ i * inp);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.main();
    }
}

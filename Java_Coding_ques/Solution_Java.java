package Java_Coding_ques;

import java.util.Scanner;
public class Solution_Java{
    void main(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input>0){
            for(int i=1;i<=input;++i){
                if(i%15==0){
                    System.out.println("FizzBuzz"+" ");
                }
                else if(i%5==0){
                    System.out.println("Buzz"+" ");
                }
                else if(i%3==0){
                    System.out.println("Fizz"+ " ");
                }
                else
                System.out.println(i+ " ");
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        Solution_Java obj = new Solution_Java();
        obj.main();
    }
}

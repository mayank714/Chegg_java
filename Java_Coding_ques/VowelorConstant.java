package Java_Coding_ques;

import java.util.Scanner;


public class VowelorConstant {
    void TakeString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you want to check");
        char str = input.next().charAt(0);
        System.out.println("You have entered '"+str+"'");
        if (str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U'){
            System.out.println("Yes the given word '"+str+"' is a vowel");
        }
        else if ((str>='a'&&str<='z')||(str>='A'&&str<='Z')){
            System.out.println("It is constant");
        }
        else
        System.out.println("Not an Alphabet ");
    }
    public static void main(String[] args) {
        VowelorConstant obj = new VowelorConstant();
        obj.TakeString();
    }
}

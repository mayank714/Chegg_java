package Java_Coding_ques;

import java.util.Scanner;
 
public class Solution
{
    public static void main(String args[])
    {
        // double mealCost;
        // int tipPrecent,taxPercent;
        Scanner sc=new Scanner(System.in);
 
       double mealCost=sc.nextDouble();
       int tipPrecent=sc.nextInt();
       int taxPercent=sc.nextInt();
 
        solve(mealCost,tipPrecent,taxPercent);
 
        sc.close();
    }
 
    private static void solve(double mealCost, int tipPrecent, int taxPercent)
    {
        int totalCost;
        double tip,tax;
        tip=mealCost*tipPrecent/100;
        tax=mealCost*taxPercent/100;
 
        totalCost= (int) Math.round(mealCost+tip+tax);
 
        System.out.println(totalCost);
    }
}
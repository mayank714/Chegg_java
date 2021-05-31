// package Chegg;
import java.util.*;
//Making a Public class Named Collector
public class Collector{

    //Making a Method that will Work in making up associates for collection
    public int collect(int montaryGoal){
        Scanner sc=null;
        try{
            sc= new Scanner(System.in);
            int res=1;
        int value=0;
        if((montaryGoal >1)&&(montaryGoal <=1000)){
            /* 
            Note : You can reinitilaize the new Value here as per your need .
            You can change the value and can seee you the recursion function is using here
            */
            //If 1 associate break into 10 different associate
            value=montaryGoal/100;
            //These are the total number of 10 assicate that we get
            System.out.println("Now these are the associate that will collect the Fund !!\n");
            for(int i=0;i<value;i++){
                System.out.println("Associate "+(i+1)+" Need to collect  € 10");
            }
            System.out.println("Enter the value you want \n 1-Break it Further\n 2-Exit\n");
            int choice=sc.nextInt();
            if(choice==1){
                //if further 10 associate need to reassign the another 10 assicate so that they only need
                // 1 per house
                value=value/10;
                System.out.println("So the new Associates are !!\n");
                for(int i=0;i<(100*value);i++){
                    System.out.println("Associate "+(i+1)+" Need to collect  € 1");
                }

            }
            else if (choice==2){
                System.exit(0);
            }

        }
        else{
            System.out.println("Sorry Wrong Input !!");
        }
        return res;
        }
        finally{
            sc.close();
        }
    }
    //Driver code 
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner (System.in);
            System.out.println("Enter the amount you want to contribute\n");
            int amount = scan.nextInt();
            Collector obj=new Collector();
            obj.collect(amount);

        }
        finally{
            scan.close();
        }
        

    }

}
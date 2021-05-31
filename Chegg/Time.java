package Chegg;
import java.util.*;
import java.lang.Math;

public class Time {
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            // Taking Input in String
            scan=new Scanner(System.in);
            System.out.println("Enter Time 1 in 24 hr format as follows(HH:MM:SS)");
            String inp1=scan.nextLine();
            System.out.println("Enter Time 2 in 24 hr format as follows(HH:MM:SS)");
            String inp2=scan.nextLine();
            System.out.println(inp1);
            // Spliting from :
            String[] arrOfStr1 = inp1.split(":", 3);
            
            String[] arrOfStr2 = inp2.split(":", 3);
            //Converting from String to Integer of FIRST Value
            int h1=Integer.parseInt(arrOfStr1[0]); 
            int m1=Integer.parseInt(arrOfStr1[1]); 
            int s1=Integer.parseInt(arrOfStr1[2]); 
            //Converting from String to Integer of SECOND Value
            int h2=Integer.parseInt(arrOfStr2[0]); 
            int m2=Integer.parseInt(arrOfStr2[1]); 
            int s2=Integer.parseInt(arrOfStr2[2]); 
            //Maintaining proper Validations so that the Input is in Valid Format
            if(((h1>=0)&&(h1<25))&&((h2>=0)&&(h2<25))&&((m1>=0)&&(m1<61))&&(m2>=0)&&(m2<61)&&((s1>=0)&&(s1<61))&&
            ((s2>=0)&&(s2<61))){
                //If the condition Satisfies , Performing the operation
                int Hrdiff=h1-h2;
                int minDiff=m1-m2;
                int secDiff= s1-s2;
                if(Hrdiff<0||minDiff<0||secDiff<0){
                    //If in case the the result is the negative , we will convert it in positive
                    int PosHrdiff=Math.abs(Hrdiff);
                    int PostMinDiff=Math.abs(minDiff);
                    int PostSecDiff=Math.abs(secDiff);
                    int Result=(3600*PosHrdiff)+(60*PostMinDiff)+PostSecDiff;
                    System.out.println("Difference in second : "+Result);
                }
                else{
                    int Result=(3600*Hrdiff)+(60*minDiff)+secDiff;
                    System.out.println("Difference in second : "+Result); 
                }
                
            }
            else{
                System.out.println("Time format is not Valid !!!!!!!");
            }
            

        }
        finally{
            scan.close();
        }
    }
    
}

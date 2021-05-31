package Chegg;
import java.util.*;

//pUBLIC Class Marks
public class Marks {
    // Method Of Grade That take argument of an Array and iteration i and output the array.
    public String Grade(int Total[],int i){
        String c="";
        if((Total[i]>=0)&&(Total[i]<=44.9)){
            c="E";
        }
        else if((Total[i]>=45)&&(Total[i]<=54.9)){
            c="D";
        }
        else if((Total[i]>=55)&&(Total[i]<=69.9)){
            c="C";
        }
        else if((Total[i]>=70)&&(Total[i]<=79.9)){
            c="B";
        }
        else if((Total[i]>=80)&&(Total[i]<=100)){
            c="A";
        }
       
        return c;
    }

    // Another Method of the Grade that is used in the resultant of marks , It take only single argument 
    public String Grade1(double m){
        String c="";
        if(( m>=0)&&( m<=44.9)){
            c="E";
        }
        else if(( m>=45)&&( m<=54.9)){
            c="D";
        }
        else if(( m>=55)&&( m<=69.9)){
            c="C";
        }
        else if(( m>=70)&&( m<=79.9)){
            c="B";
        }
        else if(( m>=80)&&( m<=100)){
            c="A";
        }
        // System.out.println(c);
        return c;
    }
    //Main Method or Driver Code
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            System.out.println("Welcome to the online marks portal\nEnter the Number of students in the class\n");
            int count =scan.nextInt();
            // Initializing all the data type that we are using in our code
            String[] Name=new String[count+2];
            int[] CourseWork=new int[count+1];
            int [] Mrking=new int[count+1];
            int [] Total=new int [count+1];
            double avgCourse=0.0;
            double avgMrking=0.0;
           
           
           // Taking the Names of the Student of the  class
            for(int i=1;i<=(count+1);i++){
                System.out.println("Enter Name of student"+(i-1));
                Name[i]=scan.nextLine();
                
               
            }
            System.out.println("\n\n");
            // Taking the Marks like CourseMarks and Mrking Marks of individual Student.
            for(int i=1;i<=count;i++){
                System.out.println("Enter Coursework Number of "+Name[i+1]);
                CourseWork[i]=scan.nextInt();
                System.out.println("Enter Mrking Number of "+Name[i+1]);
                Mrking[i]=scan.nextInt();
            }
            System.out.println("\n\n");
            // Creating a table 
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Student's Name","Coursework","Mrking"," Total","Grade");
            // Calculations of the Individual Students data , As well as the Overall Student Data
            for(int i=1;i<=(count+1);i++){
                // Creating a Object of our Public Class
                Marks obj=new Marks();
                // Initializing a Statement , After this statement only the resultant table prints of the class
                if(i==(count+1)){
                   System.out.println("\n\n");
                   // Doing Operations to calculate the Average , Percentage and The Grade of the  Overall Class
                   double avgCoursePercent=(((avgCourse)/count)/60)*100;
                   String str=obj.Grade1(avgCoursePercent);
                   double avgMrkingPercent=(((avgMrking)/count)/40)*100;
                   String str1=obj.Grade1(avgMrkingPercent);
                   double Overallpercent=(avgMrking+avgCourse)/count;
                   String str2=obj.Grade1(Overallpercent);
                   // Printing the Result
                    System.out.printf("%-20s%-20s%-20s%-20s\n","        ","Coursework","Mrking"," Overall");
                    System.out.printf("%-20s%-20f%-20f%-20f\n","Average",(avgCourse)/count,(avgMrking)/count,Overallpercent);
                    System.out.printf("%-20s%-20f%-20f%-20f\n","Percentage",(((avgCourse)/count)/60)*100,(((avgMrking)/count)/40)*100,Overallpercent);
                    System.out.printf("%-20s%-20s%-20s%-20s\n","Grade",str,str1,str2);
                    // Exiting the Program
                    System.exit(0);
                }
                // Doing Operations to calculate the Grade and Total Marks of Each Student
                Total[i]=CourseWork[i]+Mrking[i];
                avgCourse+=CourseWork[i];
                avgMrking+=Mrking[i];
               // Calling our Grade object for the calculation
               String Grade=obj.Grade(Total, i);
                // Printing the result in the form of table 
                System.out.printf("%-20s%-20d%-20d%-20d%-20s\n",Name[i+1],CourseWork[i],Mrking[i],Total[i],Grade);
               
                
            }
            
          


        }
        finally{
            scan.close();
        }
    }
    
}

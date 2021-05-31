package Chegg;
import java.util.*;
import java.util.Date;
// Class one
class TaskClass {
    // Using Scanner to scan
    Scanner scan=new Scanner(System.in);
    // Creating entity here
    String[] TaskName;
    String[] TaskDateCrea;
    String[] TaskDateComp;
    String [] TaskDesc;
    int count;
    void SetTask(int count){
        // Taking task details by user
        TaskName= new String[count];
        TaskDateCrea=new String[count];
        TaskDateComp=new String[count];
        TaskDesc =new String[count];
        for (int i=0;i<count;i++){
            System.out.println("Kindly please Enter your  TaskName "+(i+1)+"\n");
            TaskName[i]=scan.nextLine();
            
            
            Date date =new Date();
            System.out.println("The Date/Time of Creation is  \n"+date.toString());
            TaskDateCrea[i]=date.toString();
            System.out.println("Enter the task Description\n");
            TaskDesc[i]=scan.nextLine();
            System.out.println("Is the Task Complete!!! \n 1-If Completed \n2-If not Completed");

            int choice =scan.nextInt();
            if(choice==1){
                System.out.println("The Date/Time of Completion is  \n");
                scan.nextLine();
                TaskDateComp[i]=scan.nextLine();
            }
            else if (choice==2){
                TaskDateComp[i] ="Not Completed";
            }
            
        }
        // Priting the task details
        System.out.println("These are you full task\n");
        System.out.printf("%-20s%-20s%-20s%-20s\n",TaskName,TaskDateCrea,TaskDesc,TaskDateComp);
        System.out.println("--------------------------------------------/n");
        for(int i=0;i<count;i++){
            System.out.printf("%-20s%-20s%-20s%-20s\n",TaskName[i],TaskDateCrea[i],TaskDesc[i],TaskDateComp[i]);
        }
       // Calling the method again
        Scheduler obj4=new Scheduler();
         obj4.run(count);
    }
    
}
// Second Class for Operation
class Scheduler extends TaskClass{
    
    void Todo(){
        // The Todo will show all the task that are yet to be completed
    }
    void History(){
        // The Histiry will show all the task that are already completed
    }
    // Takes the user choice
    void run(int count){
        System.out.println("Please Enter Your choice !!\n1-Add a new Task\n2-See a next Task\n3-Mark next Task as Complete\n4-View Task History\n5-Clear Scheduler\n6-Exit\n");
        int choice=scan.nextInt();
        if(choice==1){
            TaskClass obj2=new TaskClass();
            obj2.SetTask(count);
        }
        else if (choice==2){
            System.out.println("Your Next Task is\n");
            for(int i=0;i<count;i++){
                System.out.println(TaskName[i]);
            }

        }
        else if (choice==3){
            System.out.println("These are Your Pending Task\n");
            for (int i=0;i<count;i++){
                if( TaskDateComp[i] =="Not Completed"){
                System.out.printf("%-20s%-20s%-20s\n",TaskName[i],TaskDateCrea[i],TaskDesc[i]);
                }
            }
            
        }
        else if (choice==4){
        //The user must enter what they want to show here    
        }
        else if (choice==5){
            // The user must enter what they wanted to show here
        }
        else if (choice==6){
            // By this user will exit the  code
            System.exit(0);
            
        }
        else
        {
            System.out.println("Sorry Wrong Input !!!\n");
            Scheduler obj=new Scheduler();
            obj.run(count);
        }
    }
    void Process(){
        System.out.println("Enter the number of Task\n");
         count =scan.nextInt();
         Scheduler obj3=new Scheduler();
         obj3.run(count);
      
    }

}
public class Task extends Scheduler{
    public static void main(String[] args) {
        Task obj1=new Task();
        obj1.Process();
    }

}


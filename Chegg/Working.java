    package Chegg;
    import java.util.*;
    class Demo{
        //Here I have Declared the Data types globbally in the Demo class which I am going to Inherit in my Parent Class
    int[] ID;
    String[] Name;
    char [] Charity;
    int [] Meeting;

    }


    public class Working extends Demo{
        //This is the public class which inherits its parent class

        //This Methods Runs and Cotinue the process  to find out that how many Members are there in the commitee
    void process(){
    Scanner scan=null;
    try{
        scan= new Scanner(System.in);
        System.out.println("How many Total Board Members are there :\n");
        int count =scan.nextInt();
        Working obj = new Working();
        obj.Members(count);
    }

    finally{
        scan.close();
    }

    }
    // After finding the number of members , this methods takes all the necesary details of a particular member and make sure 
    //whether the member is eligilbe or not for the quorum
    void Members(int count){
        Scanner scan=null; 
        try{
            int TOtEligible=0;
            scan=new Scanner(System.in);
            //Have initialized the size of the array
                ID=new int [count];
                Name=new String[count];
                Charity=new char[count];
                Meeting=new int [count];
                // Taking Details of a member
    for (int i=0;i<count;i++){
        System.out.println("Kindly please Enter your ID of"+(i+1)+" Member\n");
        ID[i]=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Name of "+(i+1)+" Member\n");
        Name[i]=scan.nextLine();
        
        System.out.println("Did they have given charity in full \n  'Enter only in Y and N' ");
        Charity[i]=scan.next().charAt(0);
        System.out.println("Number of Subcommitee meeting that he attended\n");
        Meeting[i]=scan.nextInt();

    }
    // For printing the details of all the mebers of the commitee
    System.out.printf("%-20s%-20s%-20s%-20s\n","Name ","ID","Charity Given","No of Meeting Attended");
    System.out.println("-----------------------------------------------------------------------------\n");
    for(int i=0 ;i<count;i++){

        System.out.printf("%-20s%-20d%-20s%-20d\n",Name[i],ID[i],Charity[i],Meeting[i]);
    }
    // For Identifying which member is eligible 
    System.out.println("The People that are elligible Are:\n");
    System.out.printf("%-20s%-20s%-20s%-20s\n","Name ","ID","Charity Given","No of Meeting Attended");
    System.out.println("-----------------------------------------------------------------------------\n");
        for(int i=0;i<count;i++){
            if((Charity[i]=='Y')&&(Meeting[i]>2)){
                System.out.printf("%-20s%-20d%-20s%-20d\n",Name[i],ID[i],Charity[i],Meeting[i]);
                TOtEligible++;

            }
            else{
                continue;
            }


        }
        if((TOtEligible/count)>=0.6){
            System.out.println("You can start the quorum Now !! ");
        }
        else
        System.out.println("Sorry You Can't Start the quorum Now !!");
        }
        
        finally{
            scan.close();
        }
        

    }   
    public static void main(String[] args) {
        Working obj1=new Working();
        obj1.process();
    }

    }

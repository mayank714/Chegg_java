package Chegg;
import java.util.*;
class Vehicle{
   public String Car_Owner_Name;
   public String Car_Number;
   public int Parking_Hours;
    public void Cardetails(String Car_Owner_Name,String Car_Number,int Parking_Hours){
        this.Car_Owner_Name=Car_Owner_Name;
        this.Car_Number=Car_Number;
        this.Parking_Hours=Parking_Hours;
    }
}
public class Driveway extends Vehicle {
    public void AddCar(int count,int i ){
        Scanner sc=new Scanner (System.in);
        String [] men =new String[count];
        String [] CNum=new String[count];
        int[] HDetails=new int[count];
        
            System.out.println("Please Enter the Following details\n1-Car Owner Name\n2-Car Number\n3-Parking Hours");
            Vehicle obj=new Vehicle();
            obj.Cardetails(men[i]=sc.nextLine(), CNum[i]=sc.nextLine(),HDetails[i]=sc.nextInt());
            Driveway obj1 =new Driveway();
            obj1.Processing(count, men, CNum, HDetails, i);
       
    }
    //------------------------------------------
    public void Processing(int count,String[] men ,String[] CNum,int[] HDetails,int i){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Choice\n1-Number of Cars in queue\n2-Add Another Car \n3-Show Total income\n4-Exit");
            int UserChoice =sc.nextInt();
            if(UserChoice==1){
                Driveway obj1=new Driveway();
                obj1.ShowCar(count,men,CNum,HDetails);
            }
            else if(UserChoice==2){
                Driveway obj2=new Driveway();
                obj2.AddCar((count+1), (i+1));

            }
            else if(UserChoice==3){
                Driveway obj2=new Driveway();
                obj2.OwnerIncome(HDetails, count);

            }
            else if(UserChoice==4){
                System.out.println("Thanks for using our service ");
                
            }
            else{
                System.out.println("Sorry Wrong Input , Please Enter the valid Input");
                Driveway obj1= new Driveway();
                obj1.Processing(count, men, CNum, HDetails, i);
            }
    }
    //-----------------------------------
    public void ShowCar(int count,String[] men ,String[] CNum,int[] HDetails){
        System.out.println("The Deatils are as Follows");
        for(int i=0;i<count;i++){
            System.out.println((i+1)+"-"+men[i]+" "+CNum[i]+" "+HDetails[i]);
            
        }


    }
    public void OwnerIncome(int[] HDetails,int count){
        int TotIncome =0;
        for(int i=0;i<count;i++){
            TotIncome+=(3000*HDetails[i]);
        }
        System.out.println("The Owner's Total Income is : "+TotIncome);
    }
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            int count =1;
            int i=0;
            
            System.out.println("Welcome to the Parking\n1-Add your car in Parking Queue\n2-Quit");
            int num=scan.nextInt();
            if (num==1){
            Driveway obj=new Driveway();
            obj.AddCar(count,i);
                
            }
        }
        finally{
            scan.close();
        }
    }
    
}

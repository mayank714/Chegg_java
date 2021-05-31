package Chegg;
import java.util.*;
public class Clinic {
   static Scanner scan=new Scanner (System.in);
    public void TakeInput(int Num){
        String[] PName=new String[Num];
        String [] PDob =new String [Num];
        for (int i=0;i<Num;i++){
            System.out.println("Enter the Patient "+(i+1) +" Name\n");
            // scan.nextLine();
            PName[i]=scan.nextLine();
            // scan.nextLine();
            System.out.println("Enter the Patient "+(i+1) +" DOB in the format (dd-mm-yyyy)\n");
            PDob[i]=scan.nextLine();
        }


    }
    public static void main(String[] args) {
        System.out.println("Enter the Num of Patients\n");
        int Num=scan.nextInt();
        Clinic obj=new Clinic();
        obj.TakeInput(Num);

    }
    
}

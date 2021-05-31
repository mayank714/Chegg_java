package Chegg;
import java.util.*;
public class Student {
    String[] Name;
    String[] ID;
    int[] marks;
    int count=0;
    void setDeatils(String Name, String ID, int marks,int count)throws Exception{
        this.Name[count]=Name;
        this.ID[count]=ID;
        this.marks[count]=marks;
        System.out.println("Details Saved Succesfully");
    }
    void getDetails(int count){
        for (int i=0;i<count;i++){
            System.out.println(i+"-"+Name[i]+" || "+ID[i]+" || "+marks[i]+"\n");
            
        }
        
    }
    void search(String id,int count){
            boolean found =false;
            for (int i=0;i<count;i++){
                if(id.matches(ID[count])){
                    found=true;
                    System.out.println("The marks is"+marks[count]);
                }
            }
            if(found!=true){
                System.out.println("Invalid ID !!!!");

            }
    }
    void edit(String id,int count){
        Scanner sc=new Scanner (System.in);
        boolean found =false;
        for (int i=0;i<count;i++){
            if(id.matches(ID[count])){
                int NewMarks=sc.nextInt();
                found=true;
                this.marks[count]=NewMarks;
            }
        }
        if(found!=true){
            System.out.println("Invalid ID !!!!");

        }
}
void run()throws Exception{
    Scanner scan=new Scanner (System.in);
    
    System.out.println("Welcome to the Student Directory\nPlease enter your choice\n1-Add Details\n2-Display Deatils\n3-Search Deatils\n4-Edit Deatils");
    int choice =scan.nextInt();
    Student obj=new Student();
    if(choice==1){
 
        
        obj.setDeatils(scan.nextLine(),scan.nextLine(),scan.nextInt(),count);
        count ++;
    }
   else if(choice==2){
        
    }
    else if(choice==3){
        
    }
    else if(choice==4){
        
    }
    else{
        System.out.println("Sorry Wrong Input !!!!\n");
    }
}
    public static void main(String[] args)throws Exception {
        Student obj1= new Student();
        obj1.run();
        
    }


    
}

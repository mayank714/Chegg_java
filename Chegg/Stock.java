package Chegg;

import java.util.Scanner;

public class Stock {

    /*You can use this small methods while uploading the elements of the stocks as much
    as you want , Right now I dont Know what are the elements how much type of eleents are there
    So , I am Commenting this step */


    // public Integer Books(int item){
    //     int new_Books=100;
        
    //     return new_Books;
    // }

    
    //This is the method which does all the operarions done in the SHIPEMENT
    public void Shipprocess(){
        Scanner scan=null;
        try{
            scan= new Scanner (System.in);
            //Suppose we are taking Stock here by the system itself itself for the ease
            //You can also automate it and bind up wit the scanner if you want an input Manually
            int Stock=100;
            System.out.println("Hi User do you need any item !!! Press Y for Yes and N for No");
            String Ans=scan.nextLine();
            if((Ans.matches("Y"))||(Ans.matches("y"))){
                System.out.println("Please enter the Number of Material you want");
                int num=scan.nextInt();
                if(num>0 || num<Stock){
                    System.out.println("Yes your order is available Now !!!");
                }
                Stock=Stock-num;
                System.out.println("Now Stock Available is : "+Stock);
            }
            else if((Ans.matches("N"))||(Ans.matches("n"))){
                System.out.println("Thanks For using our System Sir");
            }
            else{
                System.out.println("Sorry Wrong Input !!!!!");
            }

        }
        finally{
            scan.close();
        }

    }
    public static void main(String[] args) {
        Stock obj = new Stock();
        obj.Shipprocess();
    }
    
}

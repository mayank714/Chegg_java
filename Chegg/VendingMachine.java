package Chegg;
import java.util.*;
public class VendingMachine{
//Kindly please go through comments for better understanding

    //Dear user this is the order details 
    public void order(){
            System.out.println("A- CHIPS\n");
            System.out.println("B-COOKIES\n");
            System.out.println("C-GUM\n");
            System.out.println("D-CHOCOLATE\n");
            System.out.println("E-DRINK");
    }
    //This is the menu list which take the input from the user and choose what user demands
    void menu(String userinp){
        //I have implemented 2 Scanner in this question one in this method and another in the main class
        Scanner sc=null;
        try{
            sc=new Scanner(System.in);
            //This is happen when user choose chips
        if((userinp.matches("A"))||userinp.matches("a")){
            //This is the rate list of the materials
            System.out.println("Here are Category & Prices of all types of CHIPS\n");
            System.out.println("CHIPS 1- 0.75\n");
            System.out.println("CHIPS 2- 1.00\n");
            System.out.println("CHIPS 3- 1.25\n");
            System.out.println("Please Enter the input in terms of 1,2 & 3 only\n");
            // Taking input what user wants from the above menu
            int ChipsSel=sc.nextInt();
            if(ChipsSel==1){
            System.out.println("Your Price will be 0.75\nThanks for shopping");    
            }
            else if(ChipsSel==2){
                System.out.println("Your Price will be 1.00\nThanks for shopping");    
                }
                else if(ChipsSel==3){
                    System.out.println("Your Price will be 1.25\nThanks for shopping");    
                    }
                    else{
                        System.out.println("Sorry Wrong input\n");
                    }
            

        }
        //This is happen when user choose cookie
        else if((userinp.matches("B"))||userinp.matches("b")){
            System.out.println("Here are Category & Prices of all types of COOKIES\n");
            System.out.println(" COOKIES 1- 1.00\n");
            System.out.println(" COOKIES 2- 1.25\n");
            System.out.println(" COOKIES 3- 1.50\n");
            System.out.println("Please Enter the input in terms of 1,2 & 3 only\n");
            int CookieSel=sc.nextInt();
            if(CookieSel==1){
                System.out.println("Your Price will be 1.00\nThanks for shopping");    
                }
                else if(CookieSel==2){
                    System.out.println("Your Price will be 1.25\nThanks for shopping");    
                    }
                    else if(CookieSel==3){
                        System.out.println("Your Price will be 1.50\nThanks for shopping");    
                        }
                        else{
                            System.out.println("Sorry Wrong input\n");
                        }
        }
        //This is happen when user choose gum
        else if((userinp.matches("C"))||userinp.matches("c")){
            System.out.println("Here are Category & Prices of all types of GUM\n");
            System.out.println(" GUM 1- 0.50\n");
            System.out.println(" GUM 2- 0.75\n");
            System.out.println(" GUM 3- 1.00\n");
            System.out.println("Please Enter the input in terms of 1,2 & 3 only\n");
            int gumsel=sc.nextInt();
            if(gumsel==1){
                System.out.println("Your Price will be 0.50\nThanks for shopping");    
                }
                else if(gumsel==2){
                    System.out.println("Your Price will be 0.75\nThanks for shopping");    
                    }
                    else if(gumsel==3){
                        System.out.println("Your Price will be 1.00\nThanks for shopping");    
                        }
                        else{
                            System.out.println("Sorry Wrong input\n");
                        }
        }
        //This is happen when user choose choclate
        else if((userinp.matches("D"))||userinp.matches("d")){
            System.out.println("Here are Category & Prices of all types of CHOCOLATE\n");
            System.out.println(" CHOCOLATE 1- 0.85\n");
            System.out.println(" CHOCOLATE 2- 1.00\n");
            System.out.println(" CHOCOLATE 3- 1.15\n");
            System.out.println("Please Enter the input in terms of 1,2 & 3 only\n");
            int Chocosel=sc.nextInt();
            if(Chocosel==1){
                System.out.println("Your Price will be 0.85\nThanks for shopping");    
                }
                else if(Chocosel==2){
                    System.out.println("Your Price will be 1.00\nThanks for shopping");    
                    }
                    else if(Chocosel==3){
                        System.out.println("Your Price will be 1.15\nThanks for shopping");    
                        }
                        else{
                            System.out.println("Sorry Wrong input\n");
                        }
        }
        //This is happen when user choose drink
        else if((userinp.matches("E"))||userinp.matches("e")){
            System.out.println("Here are Category & Prices of all types of DRINK\n");
            System.out.println("DRINK 1- 0.50\n");
            System.out.println("DRINK 2- 1.00\n");
            System.out.println("DRINK 3- 1.50\n");
            System.out.println("Please Enter the input in terms of 1,2 & 3 only\n");
            int Drinksel=sc.nextInt();
            if(Drinksel==1){
                System.out.println("Your Price will be 0.50\nThanks for shopping");    
                }
                else if(Drinksel==2){
                    System.out.println("Your Price will be 1.00\nThanks for shopping");    
                    }
                    else if(Drinksel==3){
                        System.out.println("Your Price will be 1.50\nThanks for shopping");    
                        }
                        else{
                            System.out.println("Sorry Wrong input\n");
                        }
        }
    }
    finally{
        sc.close();
    }
    }
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            System.out.println("Hello !! Welcome to the Vending Machine\n");
            System.out.println("Kindly please press the option you want to puchase\n");
            //Here I have implemented my order class , which calls again and again untill the user feed is correct
            VendingMachine obj=new VendingMachine();
            obj.order();
            String userinp=scan.nextLine();
            // Here in this loop i am checking whether the input given by the user is correct or  note
            if((userinp.matches("A"))||userinp.matches("a")||(userinp.matches("B"))||userinp.matches("b")
            ||(userinp.matches("C"))||userinp.matches("c")||(userinp.matches("D"))||userinp.matches("d")
            ||(userinp.matches("E"))||userinp.matches("e")){
                obj.menu(userinp);
            }
            else{
                System.out.println("Sorry !! Invalid input\nPlease Enter the input again\n");
                obj.order();
            }
            
            
           


            


        }
        finally{
            scan.close();
        }
    }
}
package tcs_coding;

import java.util.*;

public class Vending {
    //Cofee
    public static String Coffee(int num){
        String CofeeMenu="";
        if(num==1){
            CofeeMenu="Espresso Coffee";

        }
       else if(num==2){
            CofeeMenu="Cappuccino Coffee";
            
        }
        else if(num==2){
            CofeeMenu="Latte  Coffee";
            
        }
        else
        CofeeMenu="Invalid Output";
        return CofeeMenu;
    }
    //Tea
    public static String Tea(int num){
        String TeaMenu="";
        if(num==1){
            TeaMenu="Plain Tea";

        }
    
        else if(num==2){
            TeaMenu="Assam Tea";
            
        }
        else if(num==3){
            TeaMenu="Ginger Tea";
            
        }
        else if(num==4){
            TeaMenu="Cardamom  Tea";
            
        }
        else if(num==5){
            TeaMenu="Masala Tea";
            
        }
        else if(num==6){
            TeaMenu="Lemon Tea";
            
        }
        else if(num==7){
            TeaMenu="Green Tea";
            
        }
        else if(num==8){
            TeaMenu="Organic Darjeeling Tea";
            
        }
        else
        TeaMenu="Invalid Output";
        return TeaMenu;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to CCD");
        Scanner scan=null;
        try{
            scan=new Scanner (System.in);
            String MenuType =scan.nextLine();
            if(MenuType.matches("c")||MenuType.matches("C")){
                int num=scan.nextInt();
                String Result=Coffee(num);
                if(Result.matches("Invalid Output")){
                    System.out.println("Invalid Output");
                }
                else
                System.out.println("Enjoy Your "+Result);
            }
            //Tea
            if(MenuType.matches("t")||MenuType.matches("T")){
                int num=scan.nextInt();
                String Result=Tea(num);
                if(Result.matches("Invalid Output")){
                    System.out.println("Invalid Output");
                }
                else
                System.out.println("Enjoy Your "+Result);
            }
        }
        finally{
            scan.close();
        }
        
    }
}

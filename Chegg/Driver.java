package Chegg;
import java.util.*;
 class ItemDetails {
    //declaring all the members to public
    public int Item_No;
    public String Item_Name;
    public double Selling_Price;
    public double Cost_Price;
     public double Profit;
     public double Discount;
     //Setter for settting up theItem Deatils
     public void Item(int Item_No,String Item_Name,double Cost_Price,double Selling_Price){
         this.Item_No=Item_No;
         this.Item_Name=Item_Name;
         this.Cost_Price=Cost_Price;
         this.Selling_Price=Selling_Price;

     }
     //To calculate the Profit
     public double Calculate(double Selling_Price,double Cost_Price){
         Profit =Selling_Price-Cost_Price;
        return Profit;
     }
     //To Calculate the Disount
     public double Discount(double Cost_Price,double Selling_Price){
        Discount=0.0;
        if((Selling_Price>=100)&&(Selling_Price<=200)) {
            Discount=0.1*Cost_Price;
        }
        else if((Selling_Price>=201)&&(Selling_Price<=400)) {
            Discount=0.15*Cost_Price;
        }
        else if((Selling_Price>=401)&&(Selling_Price<=1000)) {
            Discount=0.2*Cost_Price;
        }
        return Discount;
     }
     //To display the details
     public void Show(int Item_No,String Item_Name,double Selling_Price,double Cost_Price,double Profit){
         System.out.println("The Items are Deatils are as Following");
         System.out.println("Item No: "+Item_No+"\n");
         System.out.println("Item Name: "+Item_Name+"\n");
         System.out.println("Selling Price: "+Selling_Price+"\n");
         System.out.println("Cost Price: "+Cost_Price+"\n");
         System.out.println("Profit Earned : "+Profit+"\n");

     }

}
//=================================================================================================
//=================================================================================================
//Order Class
class OrderDetails extends ItemDetails{
    //declaring all the members to public
    public int Order_ID;
    public String Date;
    public String Country;
    //To set the input of the Values
    public void Order(int Order_ID,String Date,String Country){
        this.Order_ID=Order_ID;
        this.Date=Date;
        this.Country=Country;

    }
    //To display the Order details
    public void Show(int Item_No,String Item_Name,double Selling_Price,double Cost_Price
    ,double Profit,int Order_ID,String Date,String Country){
        System.out.println("The Items are Deatils are as Following");
         System.out.println("Item No: "+Item_No+"\n");
         System.out.println("Item Name: "+Item_Name+"\n");
         System.out.println("Selling Price: "+Selling_Price+"\n");
         System.out.println("Cost Price: "+Cost_Price+"\n");
         System.out.println("Profit Earned : "+Profit+"\n");
         System.out.println("Order ID : "+Order_ID+"\n");
         System.out.println("Date : "+Date+"\n");
         System.out.println("Country : "+Country+"\n");

    }


}
//=================================================================================================
//=================================================================================================
//Driver Class
public class Driver{
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            System.out.println("Hello Dear user kindly Please help us with the details\n");
            System.out.println("Please enter the item details\n1-Item_No\n2-Cost Price\n3-Selling_Price\n");
            ItemDetails obj=new ItemDetails();
            double cp;
            double sp;
            obj.Item(scan.nextInt(),scan.nextLine(),cp=scan.nextDouble(), sp=scan.nextDouble());
            System.out.println("Please enter the Order details\n1-Order ID\n2-Date\n3-Country\n");
            OrderDetails obj2=new OrderDetails();
            obj2.Order(scan.nextInt(), scan.nextLine(), scan.nextLine());
            double disc =obj.Discount(cp,sp);
            System.out.println("Total Discount : "+disc);
            }
        finally{
            scan.close();
        }
    }
}

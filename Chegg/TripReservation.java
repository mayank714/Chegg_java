package Chegg;

import java.util.Date;
import java.util.*;

// import java.sql.Date;

public class TripReservation {
    private int reservationID;
    private int numberofTravellers=1;
    private Date reservationDate;
    private Date tripBegDate;
    private Date TripEndDate;
    private double tripBaseCost=0;
    private double Tripfee=0.1*tripBaseCost;
    private double tripTaxRate  =0.7;
    private double triptaxes=tripBaseCost*tripTaxRate;
    private double tripTotalCost=tripBaseCost+Tripfee+triptaxes;
    private String tripOrigin="Miami";
    private String tripDestination="";
    private String tripStatus ="Active";

    TripReservation(Date tripBegDate,Date TripEndDate,int numberofTravellers){
        this.tripBegDate=tripBegDate;
        this.TripEndDate=TripEndDate;
        this.numberofTravellers=numberofTravellers;
        reservationID=12345;
        reservationDate=new Date();
    }
    // TripReservation((Date tripBegDate,Date TripEndDate,String tripOrigin,String tripDestination,int numberofTravellers){

    // }
    //Accessors and Mutators for Travellers
    public int getTraveller() {  
        return this.numberofTravellers;  
    }  
    public void setTraveller(int numberofTravellers) {  
        this.numberofTravellers = numberofTravellers;  
    }  
    //Accessors and Mutators for Beg Date
    public Date getBegDate() {  
        return this.tripBegDate;  
    }  
    public void setBegDate(Date tripBeDate) {  
        this.tripBegDate = tripBeDate;  
    }  
    //Accessors and Mutators for end Date
    public Date getEndDate() {  
        return this.TripEndDate;  
    }  
    public void setEndDate(Date tripEndDate) {  
        this.TripEndDate = TripEndDate;  
    }  
    // Note : You can create as many as Accessors as you need

    public int getRevID() {  
        return this.reservationID;  
    }
    public Date getRevDate() {  
        return this.reservationDate;  
    }
    public double getTripTax() {  
        return this.triptaxes;  
    }
    public double getTotCost() {  
        return this.tripTotalCost;  
    }
    //Creating a method name Cancel Reservation
    public void CancelReservation(){
        System.out.println("Your Reservation Has been Cancelled !!!!!");
    }
    public double getCostTraveller(double tripBaseCost,double Tripfee, double tripTaxRate,double triptaxes
    ,double tripTotalCost){
        double TotalTripCosting=0;
        return TotalTripCosting;
    }
    public double ApplyDiscount(double discount){
        double TotDiscount=0;
        return TotDiscount;

    }
    public static void main(String[] args) {
        System.out.println("Hello User please enter the details");
        Scanner scan=null;
            try{
                scan=new Scanner(System.in);
                //By using the Scanner Take all the input here
                
            }
            finally{
                scan.close();
            }
    }
}

package OOps;
/*Inheritance is used in Dynamic Polymorphism to extends the class
Dynamic Polymorphism basically override the method , 
If we use the same method in the parent class and the child class , Child class have the access
to override the method created in Parent class.*/

// Creating Parent class with the Method "Height"
 class SecA{
     void Height(){
         System.out.println("all students of section A has 5 feet height and 70-80 kg of weight");
     }
 }
 //creating Child class and extending the parent .
 // creating method wih the same name "Height" , but overriding it .
 class SecB extends SecA {
     void Height(){
         System.out.println("Section B students have not that much good height as compaed to Section A");
     }
 }

public class DynamicPolymorphism extends SecB{
    public static void main(String[] args) {
        SecB obj = new SecB();
        //Calling "Height " to see whether it execure Parent class output or Child class output.
        obj.Height();
    }
}

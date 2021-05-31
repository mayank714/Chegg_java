package ThisFunction;

public class ThisFunctionExample1 {
String CarName;
String CarModel;
int EnginerNumber;
int ManuFactureYear;
 ThisFunctionExample1(){
    //  this( );
     System.out.println("This is non Paramertized Constructor");
 }    
 ThisFunctionExample1(String CarName,String CarModel,int EnginerNumber,int ManuFactureYear){
    this.CarName =CarName;
    this.CarModel = CarModel;
    this.EnginerNumber = EnginerNumber;
    this.ManuFactureYear= ManuFactureYear;
    System.out.println("This message is from  Paameterized Constructor");
 }
 void show(){
     System.out.println("The Name os the Car is : "+CarName+ 
     "\n The Model of this car is : "+CarModel+
     "\n The EngineNumber of this car is :"+EnginerNumber+
     "\n The Year in which the car was manufactured is : "+ManuFactureYear  );
 }
 public static void main(String[] args) {
     ThisFunctionExample1 obj = new ThisFunctionExample1("Tesla","Q1",12345,2021);
    obj.show();
 }
}

package ThisFunction;

public class ThisFunctionExample2 {
int x;
int y;
ThisFunctionExample2(){
    x= 23;
    y=45;
    System.out.println("This mesage is from default Construtor");
}    
ThisFunctionExample2 get(){
    return this ;
}
void show(){
    System.out.println(" The value of X : "+x+"\n The Value of Y : "+y);
}
public static void main(String[] args) {
    ThisFunctionExample2 obj = new ThisFunctionExample2();
    ThisFunctionExample2 obj1 = obj.get();
    obj1.show();
}
}

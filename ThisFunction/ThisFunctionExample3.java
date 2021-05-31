package ThisFunction;

public class ThisFunctionExample3 {
int x;
int y;

ThisFunctionExample3(){
    x=23;
    y=34;
    System.out.println("Message from default constructor");
}
void get(){
    System.out.println("This is from show method");
    show(this);
}
void show(ThisFunctionExample3 obj){
    System.out.println("This is the value of X : "+obj.x+
    "\n This is the value of Y : "+obj.y);
}
public static void main(String[] args) {
    ThisFunctionExample3 obj = new ThisFunctionExample3();
    obj.get();
}
}

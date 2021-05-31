package OOps;

public class InheritanceExample {
    int x= 95;
//    System.out
    String a ="Mayank";
    void Add(){
        System.out.println("This is from class1 method1");
    }
}
class InheritanceExample2 extends InheritanceExample{
    void show(){
        System.out.println("This is the show method");
    }
    public static void main(String[] args) {
        InheritanceExample2 obj = new InheritanceExample2();
        obj.Add();
        obj.show();
        obj.x= 55;
        System.out.println(obj.x);
        
    }
    
}

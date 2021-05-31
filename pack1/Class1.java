package pack1;

public class Class1 {
    static int a=21;
    public void Class1Method3(){
        // public final int x= 21;
        System.out.println("This is priniting message from class1 Method 3");
}
public static void main(String[] args) {
    Class1 obj = new Class1();
    // obj.x;
    obj.Class1Method3();
    System.out.println(obj.a);
    System.out.println(a);
    System.out.println(Class1.a);
}
}


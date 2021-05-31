package OOps;
interface Parent{
    void add ();
    default void Addition(){
        PrivateMethod1();
        PrivateMethod2();
        System.out.println("This is the default method from iterface");
    }
    static void ChangeMethod(){
        PrivateMethod2();
        System.out.println("This is from Interface : Static Method");
    }
    private void PrivateMethod1(){
        PrivateMethod2();
        System.out.println("This is the Private Method of the interface");
    }
    private static void PrivateMethod2(){
        // PrivateMethod1()
        System.out.println("This is the Private static Method of the interface");
    }
}
class Child implements Parent{
    public void add(){
        System.out.println("Thisis from Child : Add Method");
    }
    // public void Addition(){
    //     System.out.println("This is from Child :Addition Method");
    // }

}

public class MultipleInheritanceInterfaceEx extends Child {
    public static void main(String[] args) {
        MultipleInheritanceInterfaceEx obj = new MultipleInheritanceInterfaceEx();
        obj.add();
        obj.Addition();
        Parent.ChangeMethod();
    }
}

package OOps.Multiple_Interface;

public class MultipleInheritanceInterface implements BaseInterface{
    public void method1(){
        System.out.println("This message is from Interface1 Method1");
    }
    public void method2(){
        System.out.println("This message is from Interface2 Method2");
    }
    public void method3(){
        System.out.println("This message is from Interface3 Method3");
    }
    public static void main(String[] args) {
        MultipleInheritanceInterface obj = new MultipleInheritanceInterface();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}

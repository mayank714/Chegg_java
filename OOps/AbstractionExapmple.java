package OOps;
abstract class Abstract{
    void Show(){

    }
    void DontShow(){
        System.out.println("This is from Dont show Method");
    }
    static void StaticMethod(){
        System.out.println("This message is from Static Method");
    }
}

public class AbstractionExapmple extends Abstract {
    void Show(){
        System.out.println("This is from Child class ");
    }
    public static void main(String[] args) {
        AbstractionExapmple obj = new AbstractionExapmple();
        obj.Show();
        obj.DontShow();
        Abstract.StaticMethod();
    }
}

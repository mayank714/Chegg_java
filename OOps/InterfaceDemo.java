package OOps;
// Just because we are using the interface class so instead of "Extend" we have to "Implement " the class
public class InterfaceDemo implements InterfaceExample{
    public static void main(String[] args) {
        InterfaceDemo obj= new InterfaceDemo();
        obj.add();
        //As the declation is final, so we don't have accsess to mofify the declared Variable or entity.
        // InterfaceDemo.x=23;
        System.out.println(InterfaceDemo.x);
    }
    // We need to use the "Public" Keyword for implementing the interface method.
    public void add(){
    System.out.println("Message from Add method");
    }
}
    


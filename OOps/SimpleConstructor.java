package OOps;
public class SimpleConstructor {
     String name ;
     int count ;
    SimpleConstructor(){
        count ++;
        System.out.println("This is the mesaage rom my simple constructor function");
        this.name = "Mayank Verma ";
    }
    public void Add(){
        System.out.println("This is from my Add method");
    }
    // new SimpleConstructor();
    public static void main(String[] args) {
        SimpleConstructor obj= new SimpleConstructor();
        obj.Add();
        System.out.println(obj.name);
        System.out.println(obj.count);
    }
}

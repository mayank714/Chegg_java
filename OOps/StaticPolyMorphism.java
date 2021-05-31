package OOps;
// this is the example of the method overloading (Static Polymorphism)

// Here in this class we are creating 2 method with the same Name , 
//but Parameteres are different 
class Overloading {
    void Display(int x){
        System.out.println("Value is : "+ x);
    }
    void Display(int x, int y){
        System.out.println("Value is : "+ (x+y));
    }
}
// In this class we are Calling 2 Methhods of the name "Display" but depending upon the Parametres it 
//is deciding which is called .
public class StaticPolyMorphism {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.Display(30);
        obj.Display(30,20);

    }
}

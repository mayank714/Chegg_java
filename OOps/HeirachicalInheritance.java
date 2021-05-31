package OOps;
//This is the First class of the method (Grand Parent Class)
class Gfather2{
void GfatherMethod(){
    System.out.println("They all have the property iof their GFather");
}
}
//This is the Second class of the method (first son Class)
//they may be have the property of the parent , whereas they may have the property of their own.
class Son1 extends Gfather2{
    void Son1Method1 (){
        System.out.println("This is the first son property 1");
    }
    void Son1Method2(){
        System.out.println("This is the son1 Property 2");
    }
} 
//This is the Third class of the method (Second son Class)
//they may be have the property of the parent , whereas they may have the property of their own.
class Son2 extends Gfather2{
    void Son2Method1 (){
        System.out.println("This is the second son property 1");
    }
    void Son2Method2(){
        System.out.println("This is the son2 Property 2");
    }
}
// This is the final method in which we display the individual behvaiour of the Son1 and Son2
public class HeirachicalInheritance  {
    public static void main(String[] args) {
        Son1 obj =new  Son1();
        obj.Son1Method1();
        obj.Son1Method2();
        obj.GfatherMethod();

        Son2 obj1 = new Son2();
        obj1.Son2Method1();
        obj1.Son2Method2();
        obj1.GfatherMethod();
    }
}

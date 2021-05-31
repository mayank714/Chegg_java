package OOps;

public class Test {
    void main (){
        try{
            Float f1=new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);

        }
        catch(NumberFormatException e){
            System.out.println("Bad Num");
        }
    }
    public static void main(String[] args) {
       Test obj = new Test();
       obj.main();
    }
    
}

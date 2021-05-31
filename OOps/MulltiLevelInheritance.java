package OOps;
// this is the first class 
class Gfather{
    String GFather ;
    int age ;

    void Property(){
        System.out.println("Has lot of property");
    }
    void FFighter(){
        System.out.println("Is in the war of 1947 India Independence");
    }
}
// This is the second class which inherit the property of the Geand Father
class Father extends Gfather{

void Voice(){
    System.out.println("Father has the voice same as that of Grand Father's");
}
void Business(){
    System.out.println("Has lot of business and property as well");
}

}
//This is the final class which extends the property of the fnal class
//Meanwhile if it extends the property of the final class then it will extends the property of the
// first class as well
public class MulltiLevelInheritance extends Father {
    public static void main(String[] args) {
        MulltiLevelInheritance obj = new MulltiLevelInheritance();
        obj.Property();
        obj.FFighter();
        obj.Voice();
        obj.Business();
    }
}

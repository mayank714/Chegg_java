package OOps;
import java.util.*;
public class ParamConstructor {
    int MobNum ;
    String StuName;
    String FaNum;
  
    ParamConstructor(int Mob , String Stu , String Fa){
        this.MobNum = Mob;
        this.StuName = Stu;
        this.FaNum = Fa;
        System.out.println("It is runningf");
    }
    void run(){
        System.out.println("It can run");
    }
    void eat(){
        System.out.println("It can eat");
    }
    
    class Develpper extends ParamConstructor{
        public Develpper(int Mob , String Stu , String Fa){
            super(Mob, Stu, Fa);

        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ParamConstructor obj= new ParamConstructor(scan.nextInt(), scan.nextLine(), scan.nextLine());
        // ParamConstructor obj1= new ParamConstructor(855, "Marie Gold ", "Mr Adward Singh");
        System.out.println("Hi all my name is "+ obj.StuName +"My Fathers name is "+obj.FaNum+" My Phone Number is "+obj.MobNum);
        // System.out.println("Hi all my name is "+ obj1.StuName +"My Fathers name is "+obj1.FaNum);
        Develpper obj1 = new Develpper(123, "Maa", "Yank");
        // obj1.eat();
        scan.close();
    }
}

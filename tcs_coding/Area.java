
package tcs_coding;
import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan= new Scanner (System.in);
            int a=scan.nextInt();
            double area=0;
            if(a>=20 && a<=30){
                 area=3.1415*a*a;
                 System.out.println(area);
            }
            else{
                System.out.println("Wrong Display Output");
            }
        }
        finally{
            scan.close();
        }
    }
}

package Java_Coding_ques;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner scan =null;
        try{
            scan =new Scanner (System.in);
            int inp1=scan.nextInt();
            int inp2=scan.nextInt();
            int hcf=1;
            for(int i=1;i<=inp1&&i<=inp2;i++){
                if(inp1%i==0 && inp2%i==0 ){
                    hcf=i;
                }
                
            }
            System.out.println("The Hcf is"+hcf);
                System.out.println("The lcm of numbers are "+(inp1*inp2)/hcf);
        }
        finally{
            scan.close();
        }
    }
}

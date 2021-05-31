import java.util.*;
public class Series {
    public static void main(String[] args) {
        Scanner scan = null;
        try{
            scan = new Scanner(System.in);
            int a=0,b=0;
            int n = scan.nextInt();
            for(int i=0;i<n;i++){
                if(i%2!=0){
                    if(i>1)
                        a=a+2;
                    }
                    else{
                        b=a/2;

                }
                if(n%2!=0){
                    System.out.println(a);
                }
                else{
                    System.out.println(b);
                }
            }

        }
        finally{
            scan.close();
        }
    }
}

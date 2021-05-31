package Java_Coding_ques;
import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s= scan.nextLine().split(" ");
        int[] intArr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            String num = s[i];
            intArr[i] = Integer.parseInt(num);
         }
     
        
        int[] PrimeArr = new int[100];
        for(int n=intArr[0];n<=intArr[1];n++){
            int count=0;
            for (int div=2;div*div<=n;div++){
                
                if(n%div!=0){
                    
                    count++;
                    
                   
                }
                else
                PrimeArr[count] = n;
                // count= count+1;
                
            }
            if(count==0){
                System.out.println(PrimeArr[0]);
            }
        }

         scan.close();
    }
    
}

package tcs_coding;
import java.util.*;
public class Trainee {
  void main(){
      Scanner scan = null;
      try{
        scan= new Scanner (System.in);
        //Round1
        // int Trainee1R1=scan.nextInt();
        // int Trainee2R1=scan.nextInt();
        // int Trainee3R1=scan.nextInt();
        // //Round2
        // int Trainee1R2=scan.nextInt();
        // int Trainee2R2=scan.nextInt();
        // int Trainee3R2=scan.nextInt();
        // //Round3
        // int Trainee1R3=scan.nextInt();
        // int Trainee2R3=scan.nextInt();
        // int Trainee3R3=scan.nextInt();
        int[][] trainee = new int [3][3];
        int [] average = new int [3];
        int max=0;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                trainee[i][j]=scan.nextInt();
                if(trainee[i][j]<1 ||trainee[i][j]>100 ){
                    trainee[i][j]=0;

                }
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                average[i]=average[i]+trainee[j][i];

            }
            average[i]=average[i]/3;

        }
        for(int i=0;i<3;i++){
            if(average[i]>max){
                max=average[i];
            }
        }
        for (int i=0;i<3;i++){
            if(average[i]==max){
                System.out.println("Trainee Number : "+(i+1));
            }
            if(average[i]<70){
                System.out.println("Trainee "+(i+1)+" is unfit !!!");
            }
        }

      }
      finally{
          scan.close();
      }
  }
  public static void main(String[] args) {
      Trainee obj = new Trainee();
      obj.main();
  }  
}

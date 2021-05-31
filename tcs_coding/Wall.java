package tcs_coding;

import java.io.IOException;
import java.util.*;
public class Wall {
   public static Float WallCost(int IntWall,int ExtWall)throws IOException{
       Scanner scan =null;
       try
       {
        scan =new Scanner (System.in);   
        float temp;
    float TotalCost=0;
    if(IntWall<0 || ExtWall<0){
        System.out.println("Hey user Please enter the valid Input !!!!!!");
    }
    else{
        
    if(IntWall!=0){
        for(int i=0;i<IntWall;i++){
            temp= scan.nextFloat();
            TotalCost += 18 * temp;
        }
        }
        if(ExtWall!=0){
        for(int i=0;i<ExtWall;i++){
            temp= scan.nextFloat();
            TotalCost += 12 * temp;
        }
    }
    }
    return TotalCost;
}
finally{
    scan.close();
}

   } 
   public static void main(String[] args)throws IOException{
       Scanner sc = null;
       try
    {
        sc = new Scanner(System.in);
        int IntWall =sc.nextInt();
    int ExtWall =sc.nextInt();
    float TotalCost= WallCost(IntWall, ExtWall);
    System.out.println("Total estimated Cost : "+TotalCost);
}
finally{
    sc.close();
}
   }
}

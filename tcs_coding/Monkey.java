package tcs_coding;

import java.util.*;
public class Monkey {
   public static Integer Food(int Monkey ,int PeanutNo , int PeanutVal,int BananaNo , int BananaVal) {
    int MonkeyLeft=0;
    // for(int i=0;i<(BananaNo/BananaVal);i++){

    // }
        int IntMon= Monkey -(BananaNo/BananaVal);
        MonkeyLeft=IntMon-(PeanutNo/PeanutVal);
    return MonkeyLeft;
   }
   public static void main(String[] args) {
       Scanner scan=null;
       try{
        scan=new Scanner(System.in);
        int Monkey=scan.nextInt();
        int PeanutNo=scan.nextInt();
        int PeanutVal=scan.nextInt();
        int BananaNo=scan.nextInt();
        int BananaVal=scan.nextInt();

        int Left=Food(Monkey, PeanutNo, PeanutVal, BananaNo, BananaVal);
        System.out.println("Number of  Monkeys left on the tree: "+Left);
       }
       finally{
           scan.close();
       }
   }
}

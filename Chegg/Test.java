package Chegg;

import java.util.*;

class Test {
    public static void main(String args[] ) throws Exception {
       Scanner scan= null;
       try{
           scan=new Scanner (System.in);
           int TestCaseNum=scan.nextInt();
           for(int k=0;k<TestCaseNum;k++){
            int ArrElem=scan.nextInt();
            int count=0;
            //Taking Array Operations
            int[] Arr=new int[ArrElem];
            for (int i=0;i<ArrElem;i++){
                Arr[i]=scan.nextInt();
            }
            //Operations to make it equal
             for(int i=0;i<ArrElem;i++){
                 if((i+1)>(ArrElem-1)){
                     System.out.println(count);
                    //  break;
                    // for(int m=0;m<ArrElem;m++){
                    //     System.out.println(Arr);
                    // }

                 }
                else{
                  if((Arr[i]-Arr[i+1]==3)||(Arr[i]-Arr[i+1]==-3)){
                     Arr[i+1]=Arr[i];
                     count++;
                 }
                //  else if((Arr[i]-Arr[i+1]==2)||(Arr[i]-Arr[i+1]==-2)){
                //      Arr[i+1]=Arr[i];
                //  }
                }
                 
             }
             // System.out.println()
           }
           int ab=12345;
           System.out.println(ab);

       }
       finally{
           scan.close();
       }

    }
}

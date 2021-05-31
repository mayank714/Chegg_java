package tcs_coding;

public class Pattern {
   public static void main(String[] args) {
    //    int n=4;
    //    for(int i=1;i<=n;i++){
    //        for (int j=1;j<=(2*i-1);j++){
    //            System.out.println(" ");
    //            for(int k=1;k<=(2*i-1);k++){
    //                System.out.println("*");
    //                System.out.println("\n");
    //            }
    //        }
    //    }
    int rows = 4, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }

    
   }
}

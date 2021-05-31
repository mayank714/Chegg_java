import java.io.IOException;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main()throws IOException{
        Scanner scan=null;
        try{
            //Applying the scanner
            scan = new Scanner(System.in);
            // Taking rows input from the user
            System.out.println("Enter the number of row in the matrix");
            int m=scan.nextInt();
            // Taking column input from tne user
            System.out.println("Enter the number of columns in the matrix");
            int n=scan.nextInt();  
            //Declaring first matrix
            int first[][]=new int[m][n];
            //Taking matrix input from user

            System.out.println("Enter the number of row in the second matrix");
            int o=scan.nextInt();
            // Taking column input from tne user
            System.out.println("Enter the number of columns in the second matrix");
            int p=scan.nextInt();  
            //Declaring first matrix
            int Second[][]=new int[o][p];
             int result [][]= new int[m][p];
             int sum=0;

            if(n==o){
                System.out.println("Enter the elements of first matrixs...");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                    System.out.println("Enter element at R["+i+"]["+j+"]");
                        first[i][j]=scan.nextInt();
                    }
                }
                System.out.println("Enter the elements of second matrixs...");
                for(int k=0;k<o;k++){
                    for(int l=0;l<p;l++){
                        System.out.println("Enter element at J["+k+"]["+l+"]");
                        Second[k][l]=scan.nextInt();
                    }
                }
                 
                // // Displaying the matrix
                // for(int i=0;i<m;i++){
                //     for(int j=0;j<n;j++)
                //         System.out.println(first[i][j]+" ");
                //         System.out.println(); 
                    
                // }
                // // Displyaing Second Matrix
                // for(int k=0;k<o;k++){
                //     for(int l=0;l<p;l++)
                //         System.out.println(Second[k][l]+" ");
                //         System.out.println(); 
                    
                // }

                // for (int x=0;x<m;x++){
                //     for (int z=0;z<p;z++){

                //     }
                // }

            }
            else{
                System.out.println("Multiplication of matrix is not possible !!!!!!!.....");
            }
            
        }
        catch (Exception e) { 
        } 
        finally { 
            scan.close(); 
        }
    }
    public static void main(String[] args)throws IOException {
        // MatrixMultiplication obj = new MatrixMultiplication();
        main();
    
    }
}

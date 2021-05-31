package Chegg;
import java.util.*;

public class metrics {
    //Method to print the matrix
    public void print(int[][] matrix){
        Arrays.stream(matrix)
        .forEach(
            (row) -> {
                System.out.print("[");
                Arrays.stream(row)
                .forEach((el) -> System.out.print(" " + el + " "));
                System.out.println("]");
            }
        );
            }
            //Method to print the upper matrix
        
    public void printUpperTri(int[][] matrix,int m,int n){
       
        if(m != n){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
             
            System.out.println("Upper triangular matrix: ");    
            for(int i = 0; i < m; i++){    
                for(int j = 0; j < n; j++){    
                  if(i > j)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(matrix[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
        
    }
    //Methid to print the lower matrix
    public void printLowerTri(int[][] matrix,int m,int n){
        if(m != n){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
               
            System.out.println("Lower triangular matrix: ");    
            for(int i = 0; i < m; i++){    
                for(int j = 0; j < n; j++){    
                  if(j > i)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(matrix[i][j] + " ");    
              }    
              System.out.println();    
          }    
      } 
    }
    //Method to print the diagnol of the matrix
    public void printDiagnoal(int[][] matrix,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.println("a"+(i+1)+""+(j+1)+"="+matrix[i][j]);
                }
                else{
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
        //using Scanner 
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            System.out.println("Enter the row of matrix");
            int m=scan.nextInt();
            System.out.println("Enter the column of matrix");
            int n=scan.nextInt();
            int[][] matrix=new int[m][n];
            //Taking Matrix input
            for (int i=0;i<m;i++){
                for (int j=0;j<m;j++){
                    System.out.println("Enter element at a"+(i+1)+""+(j+1));
                    matrix[i][j]=scan.nextInt();
                    scan.nextLine();
                }
            }
            System.out.println("Please enter your choice");
            System.out.println("1-Print the entire matrix\n2-Print only Upper Part of Matrix\n3-Print ony Lower Part of matrix\n4-Print all the diagnol element");
            int choice=scan.nextInt();
            //For priniting all elements of matrix
            if(choice==1){
                metrics obj = new metrics();
            obj.print(matrix);
            }
            //For priniting Upper matrix
            else if(choice==2){
                metrics obj1= new metrics();
                obj1.printUpperTri(matrix,m,n);
            }
            //For printing Lower matrix
            else if(choice==3){
                metrics obj2= new metrics();
                obj2.printLowerTri(matrix,m,n);
            }
            //For priniting diognal elements of matrix
            else if(choice==4){
                metrics obj3= new metrics();
                obj3.printDiagnoal(matrix,m,n);
            }
            else{
                System.out.println("Sorry Wrong Input !!!");
            }
            
            

        }
        finally{
            scan.close();
        }
    }
    
}

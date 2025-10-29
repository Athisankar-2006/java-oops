package intermediate;
import java.util.Scanner;

public class MatrixAdditionTranspose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] sum=new int[2][2];
        int[][] transpose=new int[2][2];
        
        System.out.println("Enter elements of first 2x2 matrix (A):");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
    

        System.out.println("Enter elements of first 2x2 matrix (B):");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=sc.nextInt();
            }
        }


        //sum of two array

        // System.out.println("Addition of arrays (A+B):");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 sum[i][j]=a[i][j]+b[i][j];
            }
        }


        //transpose of sum
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                transpose[i][j]= sum[j][i];
            }
        }

        //display all array a,b, sum,transpose


        System.out.println("Matrix A:");
        printMatrix(a);

        System.out.println("Matrix B:");
        printMatrix(b);
           
        System.out.println("Matrix SUM:");
        printMatrix(sum);
         
        System.out.println("Matrix TRANSPOSE:");
        printMatrix(transpose);

        sc.close();

    }
        //helper methods to print 2d array

        public static void printMatrix(int[][] mat){
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(mat[i][j] +"\t");
                }
                System.out.println();
         
            }
        
        
        
        }


    
    
}

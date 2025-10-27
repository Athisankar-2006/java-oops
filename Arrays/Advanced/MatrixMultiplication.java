import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
      Scanner sc =new Scanner(System.in);


      // row and column for first arrary

      System.out.print("Enter the row size for array1 : ");
      int r1=sc.nextInt();

       System.out.print("Enter the column size for array1 : ");
      int c1=sc.nextInt();

      // row and column for second array
       System.out.print("Enter the row size for array2 : ");
      int r2=sc.nextInt();

       System.out.print("Enter the column size for array1 : ");
      int c2=sc.nextInt();
   
   
      int[][] arr1=new int[r1][c1];
      int[][] arr2=new int[r2][c2];
      int[][] result=new int[c1][r2];

      if(c1!=r2){
        System.out.println("it is not possible to calculate the mulptiplication!. size of the array1 column should be eqale to array2 row");
      }

      //get element for array1
      System.out.println("Enter the array1 element :");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            // System.out.print("Enter "+i,j+" st element");
    
            arr1[i][j]=sc.nextInt();
        }
      }
   


      //get element for array2
      System.out.println("Enter array2 element:");
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            arr2[i][j]=sc.nextInt();
        }
      }

      //multiple array1 and array2
     
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0; k<c1;k++){
             result[i][j]+=arr1[i][k]*arr2[k][i];   
            }    
         }
       }


       //print the multiple value
       System.out.println("multiplied array:");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            System.out.print(result[i][j]+"\t");
        }
        System.out.println();
      }

       
   
   
   sc.close();

    }

   


}
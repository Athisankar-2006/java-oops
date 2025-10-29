package intermediate;
import java.util.Scanner;

class MatrixExample {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      

       int[] [] arr=new int[3][3];


 System.out.println("Enter 9 elemet for 3x3 matrix:");


       for( int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
        }
       }


       System.out.println("\n here the array element:");


       for(int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.println(arr[i][j]+ "\t");
        }
        System.out.println();
       }


       int sum=0;

       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            sum+=arr[i][j];
        }
       }
       System.out.println("sum of all element:"+sum);
          
     
        sc.close();
      
    }

    
}




// import java.util.Scanner;

// public class MatrixExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Create a 3x3 matrix
//         int[][] matrix = new int[3][3];

//         // Input elements
//         System.out.println("Enter 9 elements for the 3x3 matrix:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Display the matrix
//         System.out.println("\nMatrix is:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(matrix[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         // Calculate the sum of all elements
//         int sum = 0;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 sum += matrix[i][j];
//             }
//         }

//         System.out.println("\nSum of all elements: " + sum);

//         sc.close();
//     }
// }

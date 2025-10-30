import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array:");
        int n=sc.nextInt();

        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }


        }
        
        System.out.println("the original array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();

        }


        int primaryDiagonal=0;
        int secondaryDiagonal=0;


        //calculate primary diagonal and secindary diagonal
        for(int i=0;i<n;i++){
           primaryDiagonal+= arr[i][i];
            secondaryDiagonal+= arr[i][n-i-1];
        }
       int totalDiagonal=primaryDiagonal+secondaryDiagonal;

        for(int i=0;i<n;i++){
            if(n%2==1){
                totalDiagonal-=arr[n-2][n-2];
            }
          
        }


        System.out.println("primary diagonal:"+primaryDiagonal);
        System.out.println("secondary diagonal:"+secondaryDiagonal);
        System.out.println("total diagonal diagonal:"+totalDiagonal);
  

        sc.close();


    }
    
}

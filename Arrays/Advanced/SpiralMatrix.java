import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the row size:");
        int row=sc.nextInt();

        System.out.print("Enter the column size:");
        int column=sc.nextInt();

        int arr[][]= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("original array:");

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
              System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }



        int top=0, bottom=row-1, right=column-1, left=0;
      


        while (top <= bottom && left <= right) {
        //print the top most element
        for(int i= left;i<=right;i++){
            System.out.print(arr[top][i]+" ");
        }
        top++;
       
        //print the left most element
        for(int i=top;i<=bottom;i++){
             System.out.print(arr[i][right]+" ");
        }
        right--;

        if(top<=bottom){

            for(int i=right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
        }
      bottom--;
        }
      

        if(left<=right){
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
        
      sc.close();


    }
    
}

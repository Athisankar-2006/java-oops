
import java.util.Arrays;
import java.util.Scanner;

public class RearrangePosNeg {
    public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+ " st element:");
            arr[i]=sc.nextInt();
        }

          System.out.println(" the original array : "+Arrays.toString(arr));

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println(" the negavie positve array : "+Arrays.toString(arr));
        sc.close();

    }
    
}

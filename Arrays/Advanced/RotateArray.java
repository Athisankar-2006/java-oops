import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

   public static void reverse(int[] arr, int start, int end){
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
            
    }

   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();

       int[] arr= new int[n];

        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" st element :");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the key value to rotate the array: ");
        int k=sc.nextInt();

        // if array<key
        k=k%n;

        System.out.println("original array "+Arrays.toString(arr));


        // to rorate the entire array
        reverse(arr,0,n-1);

        //rotated the array based on key value
        reverse(arr,0,k-1);

        //rorate the balance element
        reverse(arr,k,n-1);


         System.out.println("reversed array : "+Arrays.toString(arr));

         sc.close();
    }

    
    
}

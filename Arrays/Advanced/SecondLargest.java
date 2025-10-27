import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n= sc.nextInt();
          

        int[] arr=new int[n];

        if( n < 2 ){
            System.out.println(" can not find the second largest");
           
        }
        
        System.out.println("array element:");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+ "st element:");
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is "+Arrays.toString(arr));

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("no largest element all are equal");
        }
        else {
            System.out.println("the second largest element is "+second);
        }


        sc.close();
    }
    
}

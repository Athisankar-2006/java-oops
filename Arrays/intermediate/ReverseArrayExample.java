package intermediate;

import java.util.Arrays;
import java.util.Scanner; 
public class ReverseArrayExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemet:");
        int n= sc.nextInt();
         int[] arr =new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+" st number : ");
            arr[i]=sc.nextInt();
        }
    
     System.out.println("original array :"+Arrays.toString(arr));
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

        System.out.println("reversed array :"+Arrays.toString(arr));
        sc.close();
}
}

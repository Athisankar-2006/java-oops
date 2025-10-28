import java.util.Arrays;
import java.util.Scanner;

public class TWOSumTwoPointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n= sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" st element:");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter target sum:");
        int target=sc.nextInt();

        Arrays.sort(arr);

        int left=0,right=n-1;
        boolean find=false;

        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                System.out.println("pair found: "+arr[left] +","+arr[right]);
                find=true;
                break;
            }

            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }

        if(!find){
            System.out.println("not pair value available");
        }
        sc.close();

    }
    
}

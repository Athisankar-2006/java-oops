import java.util.Scanner;

public class SubarrayGivenSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter "+(i+1)+" st element:");
            arr[i]=sc.nextInt();
        }

    // get target from user
    System.out.print("Enter target number :");
    int target=sc.nextInt();

    //initialize value for find subarray
    int start=0,end=0,currentSum=0;
    boolean find=false;

    while (end<n) {
        currentSum+=arr[end];

        while (currentSum>target && start<=end) {
            currentSum-=arr[start];
            start++;
            
        }
        if(target==currentSum){
            System.out.println("subarray found index from "+start+" to "+end);
            find=true;
            break;
        }
        end++;
        
    }

    if(!find){
        System.out.println("subarray not found");
    }
    
    sc.close();

    }
    
}

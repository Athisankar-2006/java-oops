import java.util.Scanner;

public class TWOsumBruteForce {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

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


        boolean find=false;


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(" the two array element is "+arr[i] +" and "+arr[j]);
                    find=true;

                }
            }
        }

        if(!find){
            System.out.println("there is no sum element");
        }
        sc.close();
    }
    
}

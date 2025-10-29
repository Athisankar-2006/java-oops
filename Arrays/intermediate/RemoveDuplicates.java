package intermediate;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter"+(i+1)+" st element:");
            arr[i]=sc.nextInt();
        }

        // create another object to store element without duplicate

        int[] temp=new int[n];
        int j=0;

        for(int i=0;i<n-1; i++){
            if(arr[i]!= arr[i+1]){
                temp[j++]=arr[i++];
            }
        }
        //add the last element
        temp[j++]=arr[n-1];

        //display the unique element

        System.out.println("the unique element:");
        for(int i=0; i<n; i++){
            System.out.print(temp[i] +" ");
        }
        sc.close();
    }
}
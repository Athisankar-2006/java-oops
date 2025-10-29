package intermediate;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearchExample {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of element to be enter:");
        int n= sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" element:");
        for(int i=0;i<n;i++){
            System.out.print((i+1) +" st Element :");
            arr[i]=sc.nextInt();

        }

        //sort the array
        Arrays.sort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));

       //get the key value
       System.out.print("Enter search key:");
       int key= sc.nextInt();

        //binary search
        int index=Arrays.binarySearch(arr, key);

        if(index>0){
            System.out.println("the key element find at "+index+" index");
        }
        else{
            System.out.println("the key element cann't find");
        }
        sc.close();
    }
    
}

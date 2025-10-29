import java.util.Arrays;
import java.util.Scanner;

public class MergeSortExample {

    public static void sorting(int[] arr,int left,int mid,int right) {

        int n1=mid-left+1;
        int n2=right-mid;

        int[] l=new int[n1];
        int[] r=new int[n2];

        for(int i=0;i<n1;i++){
            l[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=arr[mid+1+j];
        }

       int i=0,j=0,k=left;

       while(i<n1 && j<n2){
        if(l[i]<=r[j]){
            arr[k++]=l[i++];
        }
        else{
            arr[k++]=r[j++];
        }

        // add the remainnimg array

        while(i<n1){
            arr[k++]=l[i++];
        }

        while(j<n2){
            arr[k++]=r[j++];
        }


       }
        
    }


  public static void mergesort(int[] arr, int left,int right) {

     int mid=0;
     
    if(left<right){
         mid=(left+right)/2;
          
         // divide first part
    mergesort(arr, left, mid);

    //divide the second part
    mergesort(arr, mid+1, right);

    //call sorting function to combine with sort the breaking element

    sorting(arr,left,mid,right);

    }

    
    
  }




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n= sc.nextInt();


        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" st element:");
            arr[i]=sc.nextInt();
        }


        //print the original array

        System.out.print("the original array : "+Arrays.toString(arr));


        // call merge sort method to mergesort

        mergesort(arr,0,n-1);

        System.out.println("the merged array:"+Arrays.toString(arr));

        sc.close();
    }
    
}

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter number of element to be print :");
        int n1= sc.nextInt();

        //first array create
        int[] arr1= new int[n1];
        System.out.println("Enter array to be as sorted order:");
        System.out.println("enter element for 1st array:");
        for (int i=0; i<n1; i++){
            System.out.print("Enter "+(i+1)+ "st element:");
            arr1[i]=sc.nextInt();
        }

        //second array create

        System.out.print("Enter number of element to be print :");
        int n2= sc.nextInt();

         int[] arr2=new int[n2];
         System.out.println("enter element for 2st array:");
         for(int i=0; i<n2;i++){
            System.out.print("Enter "+(i+1)+ "st element:");
            arr2[1]=sc.nextInt();
         }



        
        int[] merged= new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
         if(arr1[i]<arr2[j]){
            merged[k++]=arr1[i++];
         }
         else{
            merged[k++]=arr2[j++];
         }
        }

         while(i<n1){
            merged[k++]=arr1[i++];
            
         }
         while(j<n2){
            merged[k++]=arr1[j++];
            
         }
         System.out.println("merged array:");
         for(int x:merged){
            System.out.print(x+ " ");

        }
       sc.close();
    }
    
}

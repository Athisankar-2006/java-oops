import java.util.HashSet;
import java.util.Scanner;

public class TWOSumHashSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

       boolean found=false;


        HashSet<Integer> seen=new HashSet<>();

        
        for (int num:arr){
            int compliment=target-num;
            if(seen.contains(compliment)){
                System.out.println("pair value :"+ num+ ","+compliment);
                found=true;
            }
            seen.add(num);
        }

        if(!found){
            System.out.println("pair not found!!");
        }
        sc.close();
    }
    
}

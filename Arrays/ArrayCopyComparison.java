
import java.util.Arrays;

public class ArrayCopyComparison {
    public static void main(String[] args) {
        int[] original= {10,20,30,40,50};

        //copying array1

        int[] copy1= new int[original.length];
        System.arraycopy(original, 0, copy1, 0,original.length);

        //using copyof

        int[] copy2= Arrays.copyOf(original, original.length);


        //display all array

        System.out.println("original array: "+Arrays.toString(original));
        System.out.println("copy 1 : "+Arrays.toString(copy1));
        System.out.println("copy 2: "+Arrays.toString(copy2));


        //comparison of two arrays

        System.out.println("arrays comparesion:");
        System.out.println("original vs copy1: "+Arrays.equals(original,copy1));
        System.out.println("original vs copy2: "+Arrays.equals(original, copy2));

        // change the element

         copy1[2]=23;
         System.out.println("array element changed:");
         System.out.println("original array :"+Arrays.toString(original));
         System.out.println("copy1 : "+Arrays.toString(copy1));
         System.out.println("are these equal : "+Arrays.equals(original, copy1));

    }
    
}

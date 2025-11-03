import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");

        String str=sc.nextLine().replaceAll("\\s+", "");

       char[] chars = str.toCharArray();
       Arrays.sort(chars);
       System.out.println(new String(chars));
       sc.close();
       
    }
    
}

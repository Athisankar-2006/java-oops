import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();

        Set<Character> set=new LinkedHashSet<>();
        StringBuilder sb= new StringBuilder();

        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + sb);
        sc.close();
    }
    
}

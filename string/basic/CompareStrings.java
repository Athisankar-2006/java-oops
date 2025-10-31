import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // with case sensitive

        System.out.print("Enter a string: ");
        String str1=sc.nextLine();

        System.out.print("Enter a another string: ");
        String str2=sc.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("it is equals");
        }
        else{
            System.out.println("it is not equals");
        }

        sc.close();
    }
    
}

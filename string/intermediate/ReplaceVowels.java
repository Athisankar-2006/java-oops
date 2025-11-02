import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        System.out.print("Enter replacement element: ");
        char ch=sc.next().charAt(0);

        String result=str.replaceAll("[AEIOUaeiou]",String.valueOf(ch));
        System.out.println("result : "+result);
        sc.close();
    }
}

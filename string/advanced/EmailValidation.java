import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        System.out.print("Enter a email: ");
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();

        String ptn="^[A-Za-z0-9+.-]+@[A-Za-z0-9+.-]+$";

        if(str.matches(ptn)){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
        }
        sc.close();
    }
    
}

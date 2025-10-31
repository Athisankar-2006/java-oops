import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.nextLine();

        System.out.print("Enter the starting index: ");
        int a=sc.nextInt();

        System.out.print("Enter the ending index: ");
        int b=sc.nextInt();

        
            if((a>=0 && b<str.length()-1) && a<b){
                String subs=str.substring(a, b);
                 System.out.println("the substring is : "+subs);
            }
            else{
                System.out.println("invalid indices: ");
            }

           sc.close();
        
    }
    
}

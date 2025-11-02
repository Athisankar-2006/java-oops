import java.util.Scanner;

public class PalindromeChe {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("it is not a palindrom");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        
        String[] words=str.split("\\t");
        StringBuilder sb=new StringBuilder();

        for(String word:words){
            String reversed="";
            for(int i=word.length()-1;i>=0;i--){
                reversed+=word.charAt(i);
            }
             sb.append(reversed).append(" ");

        }
        System.out.println(sb);
        sc.close();
    
    
    
    }
    
}

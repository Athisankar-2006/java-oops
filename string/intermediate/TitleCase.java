import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str= sc.nextLine().toLowerCase();

        String[] words=str.split("\\t+");
        
        StringBuilder sb=new StringBuilder();
        for(String word : words){
            if(!word.isEmpty()){
                   sb.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                       .append("");

            }
             
        }
       System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

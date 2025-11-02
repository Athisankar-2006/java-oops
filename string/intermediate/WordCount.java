import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter  a sentace:");
        String str=sc.nextLine().trim();

        if(str.isEmpty()){
            System.out.println("no element");
        }
        else{
            String[] word=str.split("\\s+");
            System.out.print("the word count: "+word.length);
        }
        sc.close();
    }
    
}

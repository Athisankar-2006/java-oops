import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersInText {
    public static void main(String[] args) {
        
        String str="here is 10 apple and 20 orenge then 30 banana";

        Pattern p= Pattern.compile("\\d+");
        Matcher m=p.matcher(str);


        int sum=0;
        if(m.find()){
            sum+=Integer.parseInt(m.group());

        }
        System.out.println("sum of all digits from string:"+sum);
    
    }
    
}

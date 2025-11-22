import java.util.ArrayList;

public class CustomSplit {

    public static String[] split(String str, char delimiter) {
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        
        for(char ch:str.toCharArray()){
            if(ch==delimiter){
                list.add(sb.toString());
                sb.setLength(0);

            }else{
                sb.append(ch);
            }

            
        }
         list.add(sb.toString());
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {

        String text="one,two,three";
        String[] result=split(text,',');

        for(String s:result){
            System.out.println(s);
        }

        
    }
    
}

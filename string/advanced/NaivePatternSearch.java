public class NaivePatternSearch {
    public static void main(String[] args) {
        
        String text="abcabdbbd";
        String key="abd";

        for(int i=0;i<text.length()-key.length();i++){
            int j=0;
            while(j<key.length() && text.charAt(i+j)== key.charAt(j)){
                j++;
            }
            if(j==key.length()){
                System.out.println("key find at "+i+ " th index");
            }
        }
    }
    
}

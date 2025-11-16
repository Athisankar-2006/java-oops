
// this problem have a trabble

public class StringCompression {
    public static void main(String[] args) {
        
        String str="aaabbc";
        int n= str.length();
        StringBuilder sb=new StringBuilder();

        int count=0;
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1)).append(count);
                count=1;
            }

        }
        System.out.println("compressed :"+sb);
        

    }
    
}

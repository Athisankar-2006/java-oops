package staticANDkeyword;



class mathutil{
    static int squr(int n){
        return n*n;
    }
}

public class stamethod {
    //static method access without creating an object

    public static void main(String[] args) {
        System.out.println("square="+mathutil.squr(12));
        
    }
    
}

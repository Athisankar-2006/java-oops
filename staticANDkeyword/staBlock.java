package staticANDkeyword;

class example{
    static{
        System.out.println("static method execution");
    }
}

public class staBlock {
    //execute before the execution
    public static void main(String[] args) {
        System.out.println("main method execution");
        example e=new example();
    }
    
}

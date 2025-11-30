package inheritance;

class A{
    A(){
        System.out.println("A constructor");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("constructor b");
    }
}


class C extends B{
    C(){
        super();
        System.out.println("constructor c");
    }
}


public class multilevel {
    public static void main(String[] args) {
        C obj= new C();
        

        
    }
    
}

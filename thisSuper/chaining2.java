package thisSuper;


class car{
     car(){
        System.out.println("this is a car");
    }
}

class bick extends car{
    bick(){
        super();
        System.out.println("this is a bick");
    }

}

public class chaining2 {
    public static void main(String[] args) {
        bick b= new bick();
    }
    
}

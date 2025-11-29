package inheritance;

// it has upcasting object


class parent{
    void msg(){
        System.out.println(" parent constructor");
    }
}

class child extends parent{
    @Override
    void msg(){
        System.out.println("child constructor");
    }
}

public class overriding {
    public static void main(String[] args) {
        parent obj=new child();//upcasting
        obj.msg();
        
    }
    
}

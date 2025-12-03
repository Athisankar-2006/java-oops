package thisSuper;


class parent{
    String name="Athi";
}

class child extends parent{
    String name="child athi";

    void show(){
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class superExample {
    public static void main(String[] args) {

        child c= new child();
        c.show();
        
    }
    
}

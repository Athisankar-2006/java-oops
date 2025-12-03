package thisSuper;

//call the parent method using super keyword


class parent{
    void animal(){
        System.out.println("this is dog from parent class");

    }
}

class child extends parent {
    void animal(){
        super.animal();
        System.out.println("this is cat from child class");
    }

    
}

public class superExample2 {
    public static void main(String[] args) {

        child c= new child();
        c.animal();
        
    }
    
}

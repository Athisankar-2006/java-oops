package inheritance;



class vehicle {
    void start(){
        System.out.println("vehicle start");
    }

    
}

class bike extends vehicle{
    void wheels(){
        System.out.println("bike has two wheels");
    }
}


class car extends vehicle{
    void wheels(){
        System.out.println("car has 4 wheels");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        car c=new car();
        bike b= new bike();     
        
        c.start();
        c.wheels();

        b.start();
        b.wheels();
    }
    
}

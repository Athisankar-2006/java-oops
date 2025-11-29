package inheritance;

class engine{
    void run(){
        System.out.println("engine is runnig");
    }
}

class vehicle extends engine{
    void start(){
        System.out.println("vehicle started");
    }
}

class car extends vehicle{
    //HAS -A relationship
    engine e=new engine();

    void carr(){
        e.run();
        System.out.println("car is moving");
        
    }
}

public class IsHas {
    public static void main(String[] args) {

        car obj= new car();

        obj.start();
        obj.carr();
        
    }
    
}

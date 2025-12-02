package Abstraction;


interface flyable{
  void fly();
    
}


interface swimable{
    void swim();
}


class duck implements flyable , swimable{

    public void fly(){
      System.out.println("duck can fly");
    }

    public void swim(){
        System.out.println("duck can swim in water");
    }
}
public class inheri {
    public static void main(String[] args) {
        

        duck d= new duck();
        d.swim();
        d.fly();
    }
    
}

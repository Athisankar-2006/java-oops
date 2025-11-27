package Constructors;

//diferrence between constructor and methos


class demo{
    int value;

    demo(){
       value=10;
       System.out.println("constructor is running");

    }

    void check(){
        System.out.println("value is "+value);
    }
}
public class difference {

    public static void main(String[] args) {
        
        demo d= new demo();
        d.check();
    }
    
}

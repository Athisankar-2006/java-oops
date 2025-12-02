package Abstraction;

//Abstraction is the process of hiding unnecessary details and showing only the important features of an object.


abstract class animal{

    abstract void sound();//abstract method

    void sleep(){
        System.out.println("animal is sleeping");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog is barking");
    }
}

public class AbsClass {
    public static void main(String[] args) {

        animal obj=new dog();
        obj.sound();
        obj.sleep();
        

    }
    
}

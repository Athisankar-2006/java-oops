package Polymorphism;


//runtime polymorphism Also called dynamic polymorphism, it is resolved during runtime. Achieved using method overriding.

class animal{

    void sound(){
        System.out.println("amimal sound ");
    }

}

class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog wowow wowow");
    }
}

class cat extends animal{
    @Override
    void sound(){
        System.out.println("cat miow miwow");
    }
}


public class runtime {
    public static void main(String[] args) {

        animal a1=new dog();
        animal a2=new cat();

        a1.sound();
        a2.sound();
        
    }
    
}

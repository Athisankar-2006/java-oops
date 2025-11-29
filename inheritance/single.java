package inheritance;

// single inheritance with super keyword

class animal{
    String type="animal";

    void sound(){
        System.out.println("animal makes sound");
    }
}

class dog extends animal{

    String type="dog";

    void show(){
        System.out.println(type);
        System.out.println(super.type);
    }

    @Override
    void sound(){
        super.sound();
        System.out.println("dog makes barks");
    }
}



public class single {
    public static void main(String[] args) {
        dog a=new dog();

        a.show();
        a.sound();
        

    }
    
}

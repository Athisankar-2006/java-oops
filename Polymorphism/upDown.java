package Polymorphism;


//upcasting and downcasting

class parent{
    void show(){
        System.out.println("parent method");
    }
}

class child extends parent{
    void show(){
        System.out.println("child methods");
    }

    void childShow(){
        System.out.println("acces only downcasting");
    }
}

public class upDown {
    public static void main(String[] args) {

        parent p=new child();
        p.show();//upcasting to access child show method

        child c= (child) p;
        c.childShow();//downcasting to acces another method in child class
        
    }
}

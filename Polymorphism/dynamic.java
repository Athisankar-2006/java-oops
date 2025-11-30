package Polymorphism;


class bank{
    double rate(){
        return 0;
    }
}

class sbi extends bank{
    double rate(){
        return 4.5;
    }
}

class canara extends bank{
    double rate(){
        return 5.6;
    }
}

public class dynamic {
    public static void main(String[] args) {

        bank b;

        b=new sbi();
        System.out.println("sbi "+b.rate());


         b=new canara();
        System.out.println("canara "+b.rate());
        
    }
    
}

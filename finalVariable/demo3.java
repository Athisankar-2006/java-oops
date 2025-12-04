package finalVariable;

class parent{
    final void ppp(){
        System.out.println("parent class can not be overridden");
    }
}


class child extends parent{
    //void ppp()
}

public class demo3 {
    public static void main(String[] args) {
        parent p= new parent();
        p.ppp();
    }
    
}

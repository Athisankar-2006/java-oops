package finalVariable;

//final paremeter can not be modified

class parent{
    void add(final int x,int y){
        // x=x+10;
        y=y+10;
        
        System.out.println(x+y);

    }
}


public class demo5 {
    public static void main(String[] args) {
        parent p= new parent();
        p.add(5, 10);
        
    }
    
}


// class Calculator {
//     void add(final int a, int b) {
//         // a = a + 10;  ❌ ERROR: final parameter cannot be modified
//         System.out.println(a + b);
//     }
// }

// public class demo5 {
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         c.add(10, 20);
//     }
// }

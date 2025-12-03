package staticANDkeyword;


class demo{
    static int a=10;
    int b=20;

     static void method1(){
        System.out.println(a);
    }

    public void instant(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class example2 {
    public static void main(String[] args) {
        demo.method1();

        demo d= new demo();
        d.instant();
    }
    
}

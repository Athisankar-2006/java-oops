
class variablesss{

    public int a =50;//public is an access modifier that allows a class, method, or variable to be accessed from anywhere in the program, 
    // including inside the same class, same package, other packages, and through inheritance.


    private int b=10;///private restricts access to within the same class only.
    //  Private members cannot be accessed from outside the class or even by subclasses (not inherited).


    protected int c=20;//protected allows access within the same package and also in subclasses of other packages. 
    // It supports inheritance-based access across packages but is not open to all classes.


    int d=60;//The default access level (package-private) means that the member is accessible only within the same package.
    //  It is not accessible from classes in different packages or subclasses outside the package.

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


public class demo1{
    public static void main(String[] args) {

        variablesss v= new variablesss();
        v.show();
        
    }
}
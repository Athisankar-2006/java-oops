package thisSuper;


//this is a reference variable in Java that refers to the current object of the class.
//It is used to access current class variables, methods, and constructors.



//Super-super is a reference variable in Java that refers to the parent class (superclass) object.
//It is used to access parent class properties and methods.


class student{

    String name;
    int age;

    void students(String n,int a){
        this.name=n;
        this.age=a;
    }

    void show(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class thisExample {
    public static void main(String[] args) {

        student obj=new student();
        obj.students("athi",12 );

        obj.show();
        
    }
    
}

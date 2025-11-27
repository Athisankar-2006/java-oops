
//default constructor is an special gunction inside the class , its run automatically when an object of te class is created


 package Constructors;

class student {

    String name;
    int age;

    student(){
        name="athi";
        age=21;
    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+name);
    }

    
}

public class DefaultConstructor {
    public static void main(String[] args) {

        student s= new student();
        s.display();
        
    }
    
}

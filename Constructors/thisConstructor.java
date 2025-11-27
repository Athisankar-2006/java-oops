package Constructors;


class student{

    String name;
    int age;

    student(){
        this("unknown",0);
    }

    student(String n){
        this(n,0);

    }

    student(String n,int a){
        name=n;
        age=a;

    }


    void display(){
        System.out.println("name:"+name+"and Age :"+age);
    }
}

public class thisConstructor {
    public static void main(String[] args) {

        student s=new student();
        student s1=new student("Athi");
        student s2=new student("kumar",18);

       s.display();
       
       s1.display();
       s2.display();
        
    }
    
}

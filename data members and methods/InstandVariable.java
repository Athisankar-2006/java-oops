
public class InstandVariable {
    public static void main(String[] args) {
        student s= new student();
        s.id=101;
        s.name="Athi sankar";

        s.display();
        
    }

    
}

// instance variable and methods

class student{
    int id;
    String name;

    void display(){
        System.out.println("student id:"+id);
        System.out.println("student name:"+name);
    }
}


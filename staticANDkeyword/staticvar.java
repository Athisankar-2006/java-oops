package staticANDkeyword;

//static-A static variable is a variable that belongs to the class, not to individual objects.
//All objects share the same static variable.



class student{
    String name;
    static String college="abs college";


    void Student(String n){
        this.name=n;
    }

    void show(){
        System.out.println(name+" "+college);
    }
}

public class staticvar {
    public static void main(String[] args) {

        student obj= new student();
        obj.Student("ironman");

        obj.show();
        
    }
    
}

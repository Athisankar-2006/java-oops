
// usin gmultiple object for the same class

 class employess {
    String name;
    int age;


    void setvar(String n, int a){
        name=n;
        age=a;
    }


    void display(){
        System.out.println("Employees name:"+name);
        System.out.println("Employees age:"+age);
    }


    
} 



public class mulObject {
    public static void main(String[] args) {

        employess e1= new employess();
        employess e2= new employess();

        e1.setvar("Athisankar",18);
        e1.display();

        e2.setvar("spider man", 19);
        e2.display();
        
    }

    
}
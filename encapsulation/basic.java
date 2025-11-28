package encapsulation;

//basic encapsulation with privert variable and getter setter


class student{

    private String name;
    private int age;


    public void settername(String n){
        name=n;

    }

    public String gettername(){
        return name;
    }

    public void setterage(int a){
        age=a;

    }

    public int getterage(){
        return age;
    }






}

public class basic {
    public static void main(String[] args) {
        

        student s= new student();

        s.settername("athi");
        
        s.setterage(12);

        System.out.println(s.gettername());
       System.out.println(s.getterage());
    }
    
}

package encapsulation;

// ✔ Class must be public
// ✔ Must have private properties
// ✔ Must have public getters & setters
// ✔ Must have a public no-arg constructor

class beanrule{
    private String name;
    private int age;

    public beanrule(){} // no argument constructor

    public void setname(String n){
        this.name=n;

    }
public String getname(){
    return this.name;
}

    public void setAge(int a){
        this.age=a;
    }

    public int getage(){
        return this.age;
    }

}


public class javabean {
    public static void main(String[] args) {

        beanrule br= new beanrule();

        br.setname("bila");
        br.setAge(12);

        System.out.println("name is "+br.getname());
        System.out.println("age is "+br.getage());

        
    }
    
}

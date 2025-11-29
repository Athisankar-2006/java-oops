package encapsulation;

//plain old java object

class student{
    private String name;
    private int age;

    public void setname(String n){
        this.name=n;

    }

    public String getname(){
        return this.name;
    }

    public void setage(int a){
        this.age=a;
    }

    public int getage(){
        return this.age;
    }

}

public class pojo {
    public static void main(String[] args) {
        
 student s= new student();

    s.setname("athi");
    s.setage(12);


    System.out.println("name:"+s.getname());
    System.out.println("age:"+s.getage());




    }

   
    
}

package Constructors;



 class  car{
    String name;
    int price;


    car(String n,int p){
        name=n;
        price=p;
    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("price:"+price);;
    }


} 

public class Parameterized {
    public static void main(String[] args) {
        car c= new car("BMW",200000);
        car c1= new car("AADi",3500000);

        c.display();
        c1.display();
    }
    
}

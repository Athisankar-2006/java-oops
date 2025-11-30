package Polymorphism;

//Polymorphism in Java means one name, many forms. 
// It allows the same method to perform different actions depending on the object that calls it.


//compile time polymorphism Also called static polymorphism, it is resolved during compile time. Achieved using method overloading.


class compile {

    public int add(int a,int b){
        return a+b;

    }

     public int add(int a,int b,int c){
        return a+b+c;

    }

     public double add(double a,double b){
        return a+b;

    }



    
}


public class poly {
    public static void main(String[] args) {

        compile c= new compile();
       System.out.println(c.add(2,4));
       System.out.println(c.add(2,4,5)); 
        System.out.println(c.add(2.4,4.5));
        
    }
    
}

package Abstraction;

abstract class shape{
    abstract void draw();  //must be implemented

    void info(){
        System.out.println("this is a shape");
    }
}


class circle extends shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
public class multiple {
    public static void main(String[] args) {
         shape obj= new circle();

         obj.draw();
         obj.info();

    }
    
}

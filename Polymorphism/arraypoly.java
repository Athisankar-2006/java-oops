package Polymorphism;


class Shape{
    void draw(){
        System.out.println("drawing shape");
    }
}

class circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

class sqare extends Shape{
    void draw(){
        System.out.println("drawing sqare");
    }
}


class triangle extends Shape{
    void draw(){
        System.out.println("drawing triangle");
    }
}


public class arraypoly {
    public static void main(String[] args) {

        Shape[] shapes={new circle(),new sqare(),new triangle() };

        for(Shape s: shapes){
            s.draw();

        }
        
    }
    
}

package Constructors;

//contructor overloading 
class box{
    int length,width,height;


    //contructor with no parameters
    box(){
      length=width=height=2;
    }

    box(int side){
        length=width=height=side;
    }

    box(int l,int w, int h){
        length=l;
        width=w;
        height=h;
    }


    void volume(){
        System.out.println("volume:"+(length*width*height));
    }
}



public class Overloading {
    public static void main(String[] args) {

        box b1= new box();
        box b2= new box( 5);
        box b3= new box(5,5,5);



        b1.volume();
        b2.volume();
        b3.volume();
        
    }
    
}

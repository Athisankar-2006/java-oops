

class rectangle{
    int length,width;

    int area(){
        return length*width;
    }
}



public class methodReturn {
    public static void main(String[] args) {

    rectangle r= new rectangle();

    r.length=10;
    r.width=3;
    int result= r.area();

    System.out.println("area of the rectangle:"+result);
        
    }
    
}

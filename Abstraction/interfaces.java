
package Abstraction;

interface vehicle {
    void start();
    void end();

    
}

class bick implements vehicle{

     public void start(){
        System.out.println("bick  started");
      }

      public void end(){
        System.out.println("bick stopped");
      }
}
public class interfaces{
    public static void main(String[] args) {

        vehicle obj= new bick();

        obj.start();
        obj.end();
        
    }

}
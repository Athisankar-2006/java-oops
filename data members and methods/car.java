
//method to set variables

class cardetails{
    String carName;
    int price;

    void setdetails(String n,int p){
        carName=n;
        price=p;


    }

    void show(){
        System.out.println("car name:"+carName);
        System.out.println("car price:"+price);
    }
}

public class car {
    public static void main(String[] args) {
        cardetails c= new cardetails();
        c.setdetails("BMW",13000000);
        c.show();
        
    }
    
}

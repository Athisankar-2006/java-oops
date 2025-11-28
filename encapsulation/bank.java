package encapsulation;
class balance{
    private int balance;


    public void cal(int a){
        if(a>0){
           balance=balance+a;
        }

    }

    public int gettter(){
        return balance;

    }
}

public class bank{
    public static void main(String[] args) {
        balance b= new balance();
        b.cal(10);

        System.out.println(b.gettter());
        
    }
}
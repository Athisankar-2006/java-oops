package staticANDkeyword;



class count{
    static int Count=0;
    int icount=0;

    count(){
        Count++;
        icount++;
    }
    void show(){
        System.out.println("static count:"+Count);
        System.out.println("instant count:"+icount);
    }
}

public class staEX {
    public static void main(String[] args) {

        count c= new count();
        count c1= new count();
        count c2= new count();

        c.show();
        c1.show();
        c2.show();
    }
    
    
}

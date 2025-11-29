package encapsulation;


//example program to understand the encapsulation


class emp{
    private int age;

    public void setAge(int n){
        if(n>18 && n<60 ){
            age=n;
        }else{
            System.out.println("invalid age");
        }
    }

    public int getage(){
        return age;
    }


}

public class example {
    public static void main(String[] args) {
        emp emp=new emp();

        emp.setAge(47);
        System.out.println(emp.getage());
        
    }
    
}

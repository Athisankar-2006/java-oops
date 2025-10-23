import java.util.Scanner;


class student{
    String name;
    int mark;

    student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
   void display(){
    System.out.println("name : "+name+", marks : "+mark);

    }

}
public class StudentArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] students= new student[5];

        for (int i=0;i<5;i++){
            System.out.print("Enter student name "+(i+1)+":");
            String name=sc.nextLine();
            System.out.print("Enter student mark "+(i+1)+":");
            int mark =sc.nextInt();
            sc.nextLine();

            students[i]= new student(name,mark);
        }


        //student deatails
        System.out.println("here the student details:");
        for (student s :students){
            s.display();
        }
        sc.close();
    }
    
}

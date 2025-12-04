package finalVariable;



class student{
    final int rollno;

     student(int r){
        rollno=r;

    }

    void show(){
        System.out.println(rollno);
    }
}
public class demo2 {
    public static void main(String[] args) {
        student s= new student(109);
        s.show();

    }
    
}



// class Student {
//     final int rollNo;   // blank final variable

//     Student(int r) {
//         rollNo = r;     // allowed (assigned once)
//     }

//     void display() {
//         System.out.println("Roll No = " + rollNo);
//     }
// }

// public class demo2 {
//     public static void main(String[] args) {
//         Student s1 = new Student(101);
//         s1.display();
//     }
// }


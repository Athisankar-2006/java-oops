package finalVariable;

//final class can not  be inherited


// final class student{
//     void show(){
//         System.out.println("can not be inherited");
//     }
// }

// public class demo4 {
//     public static void main(String[] args) {
//         student s= new student();
//         s.show();
//     }
    
// }

final class Animal {       // final class
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// class Dog extends Animal {}   ❌ ERROR: cannot extend final class

public class demo4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}


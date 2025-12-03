package thisSuper;


class Car {
    Car() {
        this("Unknown Brand");
        System.out.println("Default constructor");
    }

    Car(String name) {
        System.out.println("Car name: " + name);
    }
}

public class chaining {
    public static void main(String[] args) {
        Car c = new Car();
    }
}


class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class Java_Inheritance_1 {

    public static void main(String args[]) {

        Bird fly = new Bird();
        fly.walk();
        fly.fly();
        fly.sing();

    }
}

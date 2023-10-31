package CoreJava;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Single Inheritance
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class BabyDog extends Dog {
    void sound() {
        System.out.println("Baby dog whimpers");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        // Single inheritance
        Dog myDog = new Dog();
        myDog.sound();

        // Multilevel inheritance
        BabyDog myBabyDog = new BabyDog();
        myBabyDog.sound();

        // Hierarchical inheritance
        Cat myCat = new Cat();
        myCat.sound();
    }
}

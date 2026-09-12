package javabase;
public class Polymorphism{
    void sound(){
        System.out.println("animal is making sound");
    }
}

class Dog extends Polymorphism{
    void sound(){
        System.out.println("DOGS BARKS");
    }
}

class Cat extends Polymorphism{
    void sound(){
        System.out.println("Cat meows");
    }
}

class Main{

    public static void main(String[]  args){
        Polymorphism animal = new Dog();

        Polymorphism poly = new Polymorphism();

        Cat c = new Cat();

        animal.sound();
        poly.sound();
        c.sound();
    }
}
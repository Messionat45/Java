public class Inheritence {
    int name;
    int age;

    void eat(){
        System.out.println("Animal is eating something");
    }
}

class Dog extends Inheritence{

    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Inheritence{

    void meow(){
        System.out.println("Cat makes sound");
    }
}

class Main{
    public static void main (String[] args){
        Dog d = new Dog();
        d.bark();

        Inheritence  a = new Inheritence();
        a.eat();

        Cat c = new Cat();
        c.meow();

    }
}

package javabase;
class Abstraction {

    void startCar() {
        gearbox();
        System.out.println("Car started");
    }

    void gearbox() {
        System.out.println("Gear box shifted");
    }
}

class CarApp {
    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.startCar();
    }
}
interface driving{
    void driveVehicle();
}

class Car implements driving {
    public void driveVehicle(){
        System.out.println("Car driving");
    }
}

class bike implements driving{
    public void driveVehicle(){
        System.out.println("Bike driving");
    }
}

class vehicle{
    driving dri;

    vehicle(driving drive){
        this.dri = drive;
    }

    void startDrive(){
        System.out.println(" something will run, you decided that by injecting inside main function. that is what dependancy injection is");
        dri.driveVehicle();
    }
}

class Main{
    public static void main(String[] args){
        driving vhe = new Car();
        vehicle v = new vehicle(vhe);

        v.startDrive();
    }
}


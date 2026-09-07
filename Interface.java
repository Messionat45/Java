interface Vehicle {
    void car();
    void bike();
    void brake(int n);
    
}
public class Interface implements Vehicle {
       public void car(){
            System.out.println("i drew car");
        }
        public void bike(){
            System.out.println(" idrew bike");
        }

        public void brake(int n){
            System.out.println("dpeed decreased by "+ n);
        }
}

// interface is like contrat
// all metod of interface must be defined in teh class where they are implemenetd
// defined method must be kept in public access secifier.

class Main {
    public static void main(String[] args){
        Interface obj =  new Interface();
        obj.brake(6);
        obj.bike();
        obj.car();
    }
}


//  a single class can also impleet 2 diff interfaces

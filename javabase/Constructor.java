package javabase;
//  earlier ode i had a blance variable which was having same balnce intially
// now i am taking balnace form user, using the constructor

public class Constructor {

    String name;
    int balance, salary;
    

    //constructor has same ame as of the class. and has no return type
    Constructor(String name, int balance){
        this.name = name;
        this.balance = balance;
        this.salary = balance;
    }

    // constructor overloadinig , class dpends what to call according to arguments 
    Constructor(String name){
        this.name = name;
        this.balance = 0;
        this.salary= 1000;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    
    void increaseSalary(){
        salary += 100;
    }

    public static void main(String[] args){

        Constructor tejas = new Constructor("tejas", 10000);
        Constructor raj = new Constructor("raj", 5000);
        Constructor vi = new Constructor("vi");

        System.out.println(tejas.name + ": "+tejas.balance);
        System.out.println(raj.balance);
         System.out.println(vi.name+ " "+ vi.balance+" sal "+ vi.salary);

        tejas.withdraw(200);
        System.out.println(tejas.balance);

        tejas.increaseSalary();
        raj.increaseSalary();

        System.out.println(tejas.salary);
        System.out.println(raj.salary);

    }

    
}

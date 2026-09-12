class Encapsulation {
    
    private int balance;
    String name;

    Encapsulation(int balance, String name){
        this.name = name;
        this.balance = balance;
    }

    void withdraw(int amount){
        if(amount <= balance)balance -= amount;
        else System.out.println("amount not sufficient");
    }
    void deposit(int amount){
        balance  += amount;
    }

    void displayBalance(){
        System.out.println(balance);
    }
};

class Main{
    public static void main(String[] args){
        Encapsulation e = new Encapsulation(2000, "tejas");

        e.withdraw(500);
        e.displayBalance();

        e.deposit(500);
        e.displayBalance();
    }
}

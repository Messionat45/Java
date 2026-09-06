import java.util.ArrayList;

class BankAccount {
    
    int balance = 1000;

    // Here withdraw() shouldn't normally be static.
    // Because different objects have different balances:

    void withdraw(int amount){
        balance -= amount;
    }

    public static void main (String[] args){
        BankAccount tejas = new BankAccount();
        BankAccount raj = new BankAccount();

        tejas.withdraw(200);
        raj.withdraw(600);

        System.out.println(tejas.balance);
        System.out.println(raj.balance);
    }
}

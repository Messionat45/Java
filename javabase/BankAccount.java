package javabase;
class BankAccount {
    
    static int balance = 1000; // making this static makes single balance variable for entire class.

    // Here withdraw() shouldn't normally be static.
    // Because different objects have different balances:

    void withdraw(int amount){
        balance -= amount;
    }

    public static void main (String[] args){
        BankAccount tejas = new BankAccount();
        BankAccount raj = new BankAccount();

        tejas.withdraw(200);

        System.out.println(balance);

          raj.withdraw(600);
        System.out.println(balance);

        // added statis balance variable at top, balance is used as common vriable fo rteh entire class.
    }
}

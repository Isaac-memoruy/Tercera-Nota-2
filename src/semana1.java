public class semana1 {

    public static class BankAccount {
        String accountNumber;
        String owner;
        double balance;

        void deposit( double amount){
            balance += amount;
            System.out.println("Deposit" + amount + " new balance"+ balance);
        }

        void withdraw(double amount){
            if (balance >= amount) {
                balance-=amount;
                System.out.println("Retiro: "+ amount + "ahora el balance es :" + balance );
                
            } else {
                System.out.println("No tiene fondos suficientes");
            }
        }

        void showBalance() {
            System.out.println("su balance es :" + balance);
        }
}
public static void main(String[] args) throws Exception {
    BankAccount account1 = new BankAccount();
    account1.accountNumber = "123-456-789";
    account1.balance = 2000000;
    account1.owner = "Isaac";
    System.out.println(account1.balance);
    

    System.out.println("Number of account: " + account1.owner + " Number of Balance: " + account1.balance + " The owner:" + account1.owner );
}
}

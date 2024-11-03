public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Default constructor
    public Account() {
    }

    // Build in constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Setter & getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Extra helpful methods
    public int credit(Account client, int amount){
        System.out.println(client.getName() + ",an amount of " + amount + "SAR has been added to your bank account" +
                "\nOld balance: " + client.getBalance());
        client.setBalance(client.getBalance() + amount);// Insert money
        System.out.println("New balance: " + client.getBalance()
                + "\n------------------------------------");
        return client.getBalance(); // Will return the balance after money insertion
    }

    public int debit(Account client, int amount){
        if(balance >= amount) {// Check if there are enough money to deduct from the account
            System.out.println(client.getName() +  ", an amount of " + amount + "SAR has been deducted from your bank account "
                    + "\nOld balance: " + balance);
            client.setBalance(client.getBalance() - amount); // Debit money
            System.out.println("New balance: " + client.getBalance()
                    + "\n------------------------------------");
        }else {
            System.out.println(client.getName() + ",an attempt to deduct " + amount +
                    "SAR from your bank account but the transaction could not be completed due to insufficient balance."
                    + "\nCurrent balance: " + client.getBalance()
                    + "\n------------------------------------");
        }
        return client.getBalance(); // Will return the balance after money debited
    }

    public String transferTo(Account sender, Account Recipient , int amount){

        String feedBack;

        if (sender.getBalance() < amount){
            feedBack = "There is an issue with the transfer process " + sender.getName()
                    +"\nYour account balance is " + sender.getBalance()
                    + " and the amount to be transfer is " + amount + ".";

        }else {
            System.out.println("********************** New Transfer Process **********************");

            // First deduct the money form the sender account
            debit(sender,amount);

            // Then add the money to the recipient account
            credit(Recipient,amount);

            feedBack = "The transfer process has completed.";
        }
        return feedBack;
    }

    // toString() method
    @Override
    public String toString() {
        return "\nClient id: " + id +
                "\nClient name: " + name +
                "\nClient balance: " + balance +
                "\n------------------------------------";
    }
}
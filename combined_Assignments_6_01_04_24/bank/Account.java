public class Account {
    int accountNo;
    String name;
    int pin;
    double balance;
    Bank bank;

    public Account(int accountNo, String name, int pin, double balance, Bank bank) {
        this.accountNo = accountNo;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.bank = bank;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return this.bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

}

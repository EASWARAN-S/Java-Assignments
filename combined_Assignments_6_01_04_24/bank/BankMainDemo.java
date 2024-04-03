import java.util.Scanner;

public class BankMainDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.setBankName("Canara Bank");
        bank.setCode("1242");
        Account account = new Account(1244153611, "Easwaran", 2541, 600, bank);
        System.out.println("Enter the Account number to withDraw money");
        int accNo = sc.nextInt();
        if (account.getAccountNo() == accNo) {
            System.out.println("Enter the PIN to withDraw money");
            int pin = sc.nextInt();
            if (account.getPin() == pin) {
                System.out.println("Enter the amount to withDraw ");
                double amt = sc.nextDouble();
                try {
                    if (account.getBalance() < amt) {
                        throw new InsufficientException("Insufficient Funds");
                    } else {
                        account.setBalance(account.getBalance() - amt);
                    }
                } catch (InsufficientException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
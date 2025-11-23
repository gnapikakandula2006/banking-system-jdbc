import dao.BankDAO;
import model.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BankDAO dao = new BankDAO();

        while (true) {
            System.out.println("\n🏦 Banking System Menu");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Acc No, Name, Balance: ");
                    int accNo = sc.nextInt();
                    String name = sc.next();
                    double balance = sc.nextDouble();
                    Account acc = new Account(accNo, name, balance);
                    dao.createAccount(acc);
                    System.out.println("✅ Account created successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Acc No and Amount: ");
                    dao.deposit(sc.nextInt(), sc.nextDouble());
                    System.out.println("✅ Deposit successful!");
                }
                case 3 -> {
                    System.out.print("Enter Acc No and Amount: ");
                    dao.withdraw(sc.nextInt(), sc.nextDouble());
                }
                case 4 -> {
                    System.out.print("Enter Acc No: ");
                    dao.checkBalance(sc.nextInt());
                }
                case 5 -> {
                    System.out.println("👋 Exiting Banking System...");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid choice.");
            }
        }
    }
}
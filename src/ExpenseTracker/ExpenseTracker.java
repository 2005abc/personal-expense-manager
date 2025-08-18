package ExpenseTracker;

import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionDAO dao = new TransactionDAO();

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transactions");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter type (INCOME/EXPENSE): ");
                    String type = sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();

                    Transaction t = new Transaction(type, category, amount, date, desc);
                    dao.addTransaction(t);
                    break;
                case 2:
                    dao.viewTransactions();
                    break;
                case 3:
                    dao.showBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

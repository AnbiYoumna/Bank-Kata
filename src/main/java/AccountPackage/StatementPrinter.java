package AccountPackage;

import java.util.List;

public class StatementPrinter {
    public void print(List<Transaction> transactions) {
        System.out.println("Date || Amount || Balance");

        int balance = 0;
        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction transaction = transactions.get(i);
            balance += transaction.getAmount();
            System.out.println(transaction.getDate() + " || " + transaction.getAmount() + " || " + balance);
        }
    }
}

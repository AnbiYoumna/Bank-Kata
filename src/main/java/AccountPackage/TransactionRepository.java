package AccountPackage;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();
    private final Clock clock;

    public TransactionRepository(Clock clock) {
        this.clock = clock;
    }

    public void addTransaction(int amount) {
        transactions.add(new Transaction(clock.today(), amount));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

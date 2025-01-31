package AccountPackage;

public class Account implements AccountService {
    private final TransactionRepository transactionRepository;
    private final StatementPrinter statementPrinter;

    public Account(TransactionRepository transactionRepository, StatementPrinter statementPrinter) {
        this.transactionRepository = transactionRepository;
        this.statementPrinter = statementPrinter;
    }

    @Override
    public void deposit(int amount) {
        transactionRepository.addTransaction(amount);
    }

    @Override
    public void withdraw(int amount) {
        transactionRepository.addTransaction(-amount);
    }

    @Override
    public void printStatement() {
        statementPrinter.print(transactionRepository.getTransactions());
    }
}

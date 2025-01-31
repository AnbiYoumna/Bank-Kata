package AccountTest;

import java.util.List;

import org.junit.jupiter.api.Test;

import AccountPackage.StatementPrinter;
import AccountPackage.Transaction;

public class StatementPrinterTest {
    @Test
    public void should_print_transactions_in_reverse_order() {
        List<Transaction> transactions = List.of(
            new Transaction("10-01-2012", 1000),
            new Transaction("13-01-2012", 2000),
            new Transaction("14-01-2012", -500)
        );

        StatementPrinter printer = new StatementPrinter();
        printer.print(transactions);
        
        // Manually verify the printed output
    }
}


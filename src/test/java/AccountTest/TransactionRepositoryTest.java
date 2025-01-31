package AccountTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*; // Import Mockito static methods



import AccountPackage.Clock;
import AccountPackage.Transaction;
import AccountPackage.TransactionRepository;

public class TransactionRepositoryTest {

    @Test
    public void should_store_a_transaction() {
        // Mock the Clock class
        Clock clock = mock(Clock.class);
        
        // Specify the behavior of the mock
        when(clock.today()).thenReturn("10-01-2012");

        // Create a TransactionRepository with the mocked Clock
        TransactionRepository repository = new TransactionRepository(clock);
        
        // Add a transaction
        repository.addTransaction(1000);

        // Get the list of transactions
        List<Transaction> transactions = repository.getTransactions();
        
        // Verify that the transaction is correctly added
        assertEquals(1, transactions.size());
        assertEquals("10-01-2012", transactions.get(0).getDate());
        assertEquals(1000, transactions.get(0).getAmount());
    }
}

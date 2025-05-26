package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Testet die Interaktion von {@link Stock}- und {@link Investor}-Objekten (Test
 * von Objektnetzen).
 */
class ChangeNotificationTest {
    private Investor investor;
    private Mailbox mailbox;
    private Stock stock;

    @BeforeEach
    void setUp() {
        investor = new Investor("Erika Musterfrau");
        mailbox = investor.getMailbox();
        stock = new Stock("DE1234567", "Beispiel AG", 15.37);
        stock.addWatcher(investor);
    }

    // TODO
}

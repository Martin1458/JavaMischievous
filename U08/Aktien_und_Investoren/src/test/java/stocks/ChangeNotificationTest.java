package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.List;
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

    @Test
    void testPriceUpdateNotification() {
        stock.setPrice(14.99);
        List<String> messages = mailbox.getMessages();
        String expectedMessage = "Neuer Wert von " + stock.getName() + " (" + stock.getIsin() + ")" + ": $" + stock.getPrice();
        assertEquals(expectedMessage, messages.get(0));
    }
    @Test
    void testMultipleWatchers() {
        Investor anotherInvestor = new Investor("Max Mustermann");
        stock.addWatcher(anotherInvestor);
        stock.setPrice(16.50);
        List<String> messagesInvestor = mailbox.getMessages();
        List<String> messagesAnotherInvestor = anotherInvestor.getMailbox().getMessages();
        String expectedMessageInvestor = "Neuer Wert von " + stock.getName() + " (" + stock.getIsin() + ")" + ": $" + stock.getPrice();
        String expectedMessageAnotherInvestor = "Neuer Wert von " + stock.getName() + " (" + stock.getIsin() + ")" + ": $" + stock.getPrice();
        //assertEquals("Neuer Wert von Beispiel AG: $16.50", messagesInvestor.get(0));
        assertEquals(expectedMessageInvestor, messagesInvestor.get(0));
        assertEquals(expectedMessageAnotherInvestor, messagesAnotherInvestor.get(0));

    }
}

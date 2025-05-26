package stocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit-Tests für die Klasse {@link Stock}. Die Tests wurden nur beispielhaft
 * implementiert und sind daher noch unvollständig.
 */
class StockTest {
    private Stock stock;

    @BeforeEach
    void setUp() {
        stock = new Stock("DE1234567", "Beispiel AG", 13.37);
    }

    @Test
    void newlyCreatedStockHasNoWatchers() {
        assertEquals(Collections.emptySet(), stock.getWatchers());
    }
}

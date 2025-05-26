package stocks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit-Tests für die Klasse {@link Investor}. Die Tests wurden nur beispielhaft
 * implementiert und sind daher noch unvollständig.
 */
class InvestorTest {
    /** Erlaubte Abweichung für Vergleich von double-Werten. */
    private static final double TOLERANCE = 0.00001;

    private Investor investor;

    @BeforeEach
    void setUp() {
        investor = new Investor("Erika Musterfrau");
    }

    @Test
    void valueOfEmptyDepositIsZero() {
        assertEquals(0.0, investor.valueOfDeposit(), TOLERANCE);
    }

    @Test
    void valueOfNonEmptyDepositIsNonZero() {
        investor.buyShares(new Stock("DE1234567", "Beispiel AG", 12.3), 3);
        assertEquals(36.9, investor.valueOfDeposit(), TOLERANCE);
    }

    @Test
    void newlyCreatedInvestorHasNoStocks() {
        assertEquals(Collections.emptyMap(), investor.getDeposit());
    }
}

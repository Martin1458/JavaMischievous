package stocks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Investoren werden durch einen Namen beschrieben. Sie können Aktien
 * ({@link Stock}) kaufen und verkaufen sowie sich über deren Preisverfall
 * informieren lassen.
 */
public class Investor implements StockChangeWatcher {
    private final String name;
    private final Mailbox mailbox;

    private final Map<Stock, Integer> deposit = new HashMap<>();

    public Investor(String name) {
        this.name = name;
        this.mailbox = new Mailbox();
    }

    @Override
    public void priceUpdated(Stock stock) {
        mailbox.sendMessage("Neuer Wert von " + stock + ": $" + stock.getPrice());
    }

    public void buyShares(Stock stock, int numberOfShares) {
        if (deposit.containsKey(stock)) {
            deposit.put(stock, deposit.get(stock) + numberOfShares);
        } else {
            deposit.put(stock, numberOfShares);
        }
    }

    public double valueOfDeposit() {
        double total = 0.0;
        for (Map.Entry<Stock, Integer> entry : deposit.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public Map<Stock, Integer> getDeposit() {
        return Collections.unmodifiableMap(deposit);
    }

    @Override
    public String toString() {
        return "<Investor " + name + ">";
    }

    public Mailbox getMailbox() {
        return mailbox;
    }
}

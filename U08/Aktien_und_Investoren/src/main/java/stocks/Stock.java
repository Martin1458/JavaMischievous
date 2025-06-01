package stocks;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Aktien werden durch eine feste ISIN (International Securities Identification
 * Number) und einen festen Namen beschrieben und können ihren Preis ändern.
 * Durch einen Benachrichtigungsmechanismus ({@link StockChangeWatcher}) können
 * interessierte Parteien über Preisverfälle informiert werden.
 */
public class Stock {
    private final String isin;
    private final String name;
    private double price;

    private final Set<StockChangeWatcher> watchers = new HashSet<>();

    public Stock(String isin, String name, double price) {
        this.isin = isin;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
        notifyWatchers();
    }

    private void notifyWatchers() {
        for (StockChangeWatcher watcher : watchers) {
            watcher.priceUpdated(this);
        }
    }

    public boolean addWatcher(StockChangeWatcher watcher) {
        return watchers.add(watcher);
    }

    public boolean removeWatcher(StockChangeWatcher watcher) {
        return watchers.remove(watcher);
    }

    public Set<StockChangeWatcher> getWatchers() {
        return Collections.unmodifiableSet(watchers);
    }

    public String getIsin() {
        return isin;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + isin + ")";
    }
}

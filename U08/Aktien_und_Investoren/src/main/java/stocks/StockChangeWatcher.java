package stocks;

/**
 * Über diese Schnittstelle können sich interessierte Parteien über
 * Preisverfälle ihrer Aktien informieren lassen.
 */
public interface StockChangeWatcher {
    void priceUpdated(Stock stock);
}

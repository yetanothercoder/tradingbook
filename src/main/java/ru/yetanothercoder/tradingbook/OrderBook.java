package ru.yetanothercoder.tradingbook;

import java.util.List;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public interface OrderBook<S> {
    public StockTransaction<S> executeOrEnqueue(Stock<S> order);

    public List<StockTransaction<S>> executeOrdersOnQuote(Quote<S> newQuote);

    public void expire(Stock<S>... expired);

    public List<Stock<S>> removeMostProfitableFirst(Stock<S> traded);

    public Side getSide();
}

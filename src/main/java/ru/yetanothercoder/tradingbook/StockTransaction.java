package ru.yetanothercoder.tradingbook;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class StockTransaction<T> {
    public final List<Stock<T>> orders;
    public final long executedDate;
    public final BigDecimal profit;

    public StockTransaction(List<Stock<T>> orders, BigDecimal profit) {
        this.orders = orders;
        this.profit = profit;
        this.executedDate = System.currentTimeMillis();
    }


}

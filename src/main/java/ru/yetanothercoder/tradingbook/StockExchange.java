package ru.yetanothercoder.tradingbook;

import java.math.BigDecimal;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class StockExchange {
    public static void main(String[] args) {
        ForexOrderBook orderBook = new ForexOrderBook();

        Forex buy$29_100 = Forex.createBuyOrder(BigDecimal.valueOf(29), 100, Currency.USD);
        Forex buy$28_200 = Forex.createBuyOrder(BigDecimal.valueOf(28), 200, Currency.USD);
        Forex buy$27_300 = Forex.createBuyOrder(BigDecimal.valueOf(27), 300, Currency.USD);

        orderBook.executeOrEnqueue(buy$29_100);
        orderBook.executeOrEnqueue(buy$28_200);
        orderBook.executeOrEnqueue(buy$27_300);

    }
}

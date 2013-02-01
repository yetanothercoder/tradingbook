package ru.yetanothercoder.tradingbook;

import java.math.BigDecimal;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class Forex extends Stock<Currency> {

    public Forex(BigDecimal price, Side side, int quantity, Currency type) {
        super(price, side, quantity, type);
    }

    public static Forex createBuyOrder(BigDecimal price, int quantity, Currency type) {
        return new Forex(price, Side.BUY, quantity, type);
    }

    public static Forex createSellOrder(BigDecimal price, int quantity, Currency type) {
        return new Forex(price, Side.BUY, quantity, type);
    }
}

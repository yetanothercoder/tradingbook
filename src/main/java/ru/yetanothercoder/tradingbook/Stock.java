package ru.yetanothercoder.tradingbook;

import java.math.BigDecimal;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class Stock<S> {

    public final BigDecimal price;
    public final Side side;
    public final int size;
    public final S security;

    public Stock(BigDecimal price, Side side, int size, S security) {
        this.price = price;
        this.side = side;
        this.size = size;
        this.security = security;
    }

    public Stock<S> tradeWith(Stock<S> other) {
        return cloneWithNewSize(size - other.size);
    }

    public Stock<S> cloneWithNewSize(int size) {
        return new Stock<S>(this.price, this.side, size, this.security);
    }

}